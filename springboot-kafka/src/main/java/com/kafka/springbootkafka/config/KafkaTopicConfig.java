package com.kafka.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic kafkaTopic(){
        return TopicBuilder.name("kafkatopic").build();
    }

    @Bean
    public NewTopic kafkaTopicJson(){
        return TopicBuilder.name("kafkatopic_json").build();
    }
}
