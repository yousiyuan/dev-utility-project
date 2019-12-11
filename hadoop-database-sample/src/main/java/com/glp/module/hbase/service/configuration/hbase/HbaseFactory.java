package com.glp.module.hbase.service.configuration.hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.security.UserGroupInformation;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public enum HbaseFactory {
    /**
     * 开发环境
     */
    ENV_DEV,
    /**
     * 测试环境
     */
    ENV_TEST,
    /**
     * UAT验收环境
     */
    ENV_UAT,
    /**
     * 生产环境
     */
    ENV_RELEASE;

    HbaseFactory() {
    }

    private Builder builder;
    private HbaseFactory setBuilder(Builder builder) {
        this.builder = builder;
        return this;
    }

    public Connection createConnection() throws IOException {
        System.setProperty(HbaseConstants.KRB5_CONF, builder.krb5Conf);
        System.setProperty(HbaseConstants.KRB5_REALM, builder.krb5Realm);
        System.setProperty(HbaseConstants.KRB5_KDC, builder.krb5Kdc);

        Configuration configEntries = HBaseConfiguration.create();
        InputStream resourceInStream = Objects.requireNonNull(this.getClass().getClassLoader().getResourceAsStream(builder.resourcePath));
        configEntries.addResource(resourceInStream);
        configEntries.set(HbaseConstants.HADOOP_SECURITY_AUTHENTICATION, builder.hadoopSecurityAuthentication);
        configEntries.set(HbaseConstants.KEYTAB_FILE, builder.keytabFile);
        configEntries.set(HbaseConstants.KERBEROS_PRINCIPAL, builder.loginUser);

        UserGroupInformation.setConfiguration(configEntries);
        UserGroupInformation.loginUserFromKeytab(builder.loginUser, builder.keytabFile);

        return ConnectionFactory.createConnection(configEntries);
    }

    public static class Builder {
        private String environment;
        private String krb5Conf;
        private String krb5Realm = "GLP.COM";
        private String krb5Kdc;
        private String resourcePath;
        private String hadoopSecurityAuthentication = "Kerberos";
        private String keytabFile;
        private String loginUser;

        public synchronized HbaseFactory build() {
            this.environment = Objects.requireNonNull(this.environment);
            switch (this.environment) {
                case "dev":
                    return HbaseFactory.ENV_DEV.setBuilder(this);
                case "test":
                    return HbaseFactory.ENV_TEST.setBuilder(this);
                case "uat":
                    return HbaseFactory.ENV_UAT.setBuilder(this);
                case "release":
                    return HbaseFactory.ENV_RELEASE.setBuilder(this);
                default:
                    throw new RuntimeException("无效的枚举值");
            }
        }

        public Builder setEnvironment(String environment) {
            this.environment = environment;
            return this;
        }

        public Builder setKrb5Conf(String krb5Conf) {
            this.krb5Conf = krb5Conf;
            return this;
        }

        public Builder setKrb5Realm(String krb5Realm) {
            this.krb5Realm = krb5Realm;
            return this;
        }

        public Builder setKrb5Kdc(String krb5Kdc) {
            this.krb5Kdc = krb5Kdc;
            return this;
        }

        public Builder setResourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder setHadoopSecurityAuthentication(String hadoopSecurityAuthentication) {
            this.hadoopSecurityAuthentication = hadoopSecurityAuthentication;
            return this;
        }

        public Builder setKeytabFile(String keytabFile) {
            this.keytabFile = keytabFile;
            return this;
        }

        public Builder setLoginUser(String loginUser) {
            this.loginUser = loginUser;
            return this;
        }
    }

    static class HbaseConstants {
        static final String KRB5_CONF = "java.security.krb5.conf";
        static final String KRB5_REALM = "java.security.krb5.realm";
        static final String KRB5_KDC = "java.security.krb5.kdc";
        static final String HADOOP_SECURITY_AUTHENTICATION = "hadoop.security.authentication";
        static final String KEYTAB_FILE = "keytab.file";
        static final String KERBEROS_PRINCIPAL = "kerberos.principal";
    }
}
