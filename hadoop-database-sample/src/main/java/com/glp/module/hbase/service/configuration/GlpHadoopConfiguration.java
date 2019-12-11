package com.glp.module.hbase.service.configuration;

import com.glp.module.hbase.service.configuration.hbase.HbaseConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {HbaseConfig.class})
public class GlpHadoopConfiguration {

}
