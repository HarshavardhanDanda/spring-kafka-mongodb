package com.kafka.mongodb.kafka;

import com.kafka.mongodb.entity.Employee;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    private KafkaTemplate<String, Employee> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, Employee> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(Employee data){
        Message<Employee> message = MessageBuilder.withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "employeetopic").build();
        kafkaTemplate.send(message);
    }
}
