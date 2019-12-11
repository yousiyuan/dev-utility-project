package com.glp.backend.risk.tools.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"com.glp.backend.mybatis.generate.dao"})
public class MybatisGeneratorConfiguration {
}
