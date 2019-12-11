package com.glp.data.warehouse.configuration;

import com.glp.data.warehouse.configuration.datasource.DwRiskConfig;
import com.glp.data.warehouse.configuration.datasource.GlpBlUserConfig;
import com.glp.data.warehouse.configuration.datasource.GlpFactorConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {DwRiskConfig.class, GlpFactorConfig.class, GlpBlUserConfig.class})
public class ArtemisWareHouseConfiguration {
}
