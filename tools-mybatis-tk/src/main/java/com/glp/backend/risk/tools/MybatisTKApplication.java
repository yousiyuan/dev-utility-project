package com.glp.backend.risk.tools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class MybatisTKApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisTKApplication.class, args);
    }

}
