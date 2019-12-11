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

@MapperScan(basePackages = {"com.glp.data.warehouse.dao.glp.factor"}, sqlSessionFactoryRef = "glpFactorSqlSessionFactory")
public class GlpFactorConfig {

    @Bean(name = "glpFactorDB")
    @ConfigurationProperties(prefix = "spring.datasource.druid.glp-factor")
    public DataSource glpFactorDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "glpFactorSqlSessionFactory")
    public SqlSessionFactory glpFactorSqlSessionFactory(@Qualifier("glpFactorDB") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("mybatis/mybatis.glpFactor.cfg.xml"));
        sqlSessionFactoryBean.setTypeAliasesPackage("com.glp.data.warehouse.entity.glp.factor");
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mybatis/mapper/glpFactor/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean(name = "glpFactorTransactionManager")
    public DataSourceTransactionManager glpFactorTransactionManager(@Qualifier("glpFactorDB") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean("glpFactorSqlSessionTemplate")
    public SqlSessionTemplate glpFactorSqlSessionTemplate(@Qualifier("glpFactorSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
