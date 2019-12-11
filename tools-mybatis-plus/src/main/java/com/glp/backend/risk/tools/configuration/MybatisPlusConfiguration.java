package com.glp.backend.risk.tools.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.artemis.sparrow"})
@MapperScan(basePackages = {"org.artemis.sparrow.mybatis.plus.generator.mapper"})
public class MybatisPlusConfiguration {
}
