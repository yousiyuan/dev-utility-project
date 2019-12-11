package com.glp.backend.risk.tools.configuration;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = {"org.artemis.sparrow.dao"})
public class MybatisTKConfiguration {
}
