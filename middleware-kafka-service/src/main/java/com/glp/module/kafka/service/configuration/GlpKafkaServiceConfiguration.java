package com.glp.module.kafka.service.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GlpKafkaServiceConfiguration {

    @Value("${spring.kafka.consumer.group-id}")
    private String kafkaConsumerGroup;

    @Bean("kafkaConsumerGroup")
    public String kafkaConsumerGroup() {
        return this.kafkaConsumerGroup;
    }

}
