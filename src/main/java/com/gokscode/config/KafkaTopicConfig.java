package com.gokscode.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    // This is creating a new topic
    // When the application starts, this method run automatically
    // It will create a kafka topic called gokscode.
    // This uses a builder pattern.
    @Bean
    public NewTopic goksCodeTopic(){
        return TopicBuilder.name("gokscode").build()
;    }
}
