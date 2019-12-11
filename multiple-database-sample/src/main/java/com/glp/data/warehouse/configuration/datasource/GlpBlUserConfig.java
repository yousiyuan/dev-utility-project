package com.glp.data.warehouse.configuration.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

@MapperScan(basePackages = {"com.glp.data.warehouse.dao.glp.bluser"}, sqlSessionFactoryRef = "glpBlUserSqlSessionFactory")
public class GlpBlUserConfig {

    @Bean(name = "glpBlUserDB")
    @ConfigurationProperties(prefix = "spring.datasource.druid.glp-bl-user")
    public DataSource glpBlUserDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "glpBlUserSqlSessionFactory")
    public SqlSessionFactory glpBlUserSqlSessionFactory(@Qualifier("glpBlUserDB") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("mybatis/mybatis.glpBlUser.cfg.xml"));
        sqlSessionFactoryBean.setTypeAliasesPackage("com.glp.data.warehouse.entity.glp.bluser");
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mybatis/mapper/glpBlUser/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean(name = "glpBlUserTransactionManager")
    public DataSourceTransactionManager glpBlUserTransactionManager(@Qualifier("glpBlUserDB") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean("glpBlUserSqlSessionTemplate")
    public SqlSessionTemplate glpBlUserSqlSessionTemplate(@Qualifier("glpBlUserSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
