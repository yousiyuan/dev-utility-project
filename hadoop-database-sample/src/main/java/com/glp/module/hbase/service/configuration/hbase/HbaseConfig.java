package com.glp.module.hbase.service.configuration.hbase;

import org.apache.hadoop.hbase.client.Connection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;
import java.util.Objects;

@PropertySource(value = {"classpath:hbase.properties"})
public class HbaseConfig {

    @Autowired
    public HbaseConfig(ResourcePatternResolver resourcePatternResolver) {
        this.resourcePatternResolver = resourcePatternResolver;
    }

    @Value("${spring.profiles.active}")
    private String env;
    @Value("${hadoop.database.user}")
    private String hbaseUser;
    @Value("${kerberos.krb5.kdc}")
    private String krb5Kdc;

    private ResourcePatternResolver resourcePatternResolver;

    @Bean("hadoopConnection")
    public Connection hadoopConnection() throws IOException {
        String krb5ConfigPath = String.format("krb5-%s.conf", env);
        String resourcePath = String.format("hbase-site-%s.xml", env);
        String keytabPath = String.format("hbase-%s.keytab", env);

        System.out.println(resourcePatternResolver.getResource("classpath:" + krb5ConfigPath).getURI().getPath());
        System.out.println(resourcePatternResolver.getResource("classpath:" + resourcePath).getURI().getPath());
        System.out.println(resourcePatternResolver.getResource("classpath:" + keytabPath).getURI().getPath());

        String krb5ConfPath = Objects.requireNonNull(this.getClass().getClassLoader().getResource(krb5ConfigPath)).getPath();
        String KeytabFilePath = Objects.requireNonNull(this.getClass().getClassLoader().getResource(keytabPath)).getPath();

        HbaseFactory hbaseFactory = new HbaseFactory.Builder()
                .setEnvironment(env)
                .setKrb5Conf(krb5ConfPath)
                .setKrb5Kdc(krb5Kdc)
                .setResourcePath(resourcePath)
                .setKeytabFile(KeytabFilePath)
                .setLoginUser(hbaseUser)
                .build();
        return hbaseFactory.createConnection();
    }

}
