package com.glp.data.warehouse.configuration.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

@MapperScan(basePackages = {"com.glp.data.warehouse.dao.dw.risk"}, sqlSessionFactoryRef = "dwRiskSqlSessionFactory")
public class DwRiskConfig {

    @Primary
    @Bean(name = "dwRiskDB")
    @ConfigurationProperties(prefix = "spring.datasource.druid.dw-risk")
    public DataSource dwRiskDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "dwRiskSqlSessionFactory")
    public SqlSessionFactory dwRiskSqlSessionFactory(@Qualifier("dwRiskDB") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("mybatis/mybatis.dwRisk.cfg.xml"));
        sqlSessionFactoryBean.setTypeAliasesPackage("com.glp.data.warehouse.entity.dw.risk");
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mybatis/mapper/dwRisk/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    @Primary
    @Bean(name = "dwRiskTransactionManager")
    public DataSourceTransactionManager dwRiskTransactionManager(@Qualifier("dwRiskDB") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Primary
    @Bean("dwRiskSqlSessionTemplate")
    public SqlSessionTemplate dwRiskSqlSessionTemplate(@Qualifier("dwRiskSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
