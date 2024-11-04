package com.example.openshift.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(id = "test1", topics = "test-topic")
    public void consumeMessage(Employee message) {
        System.out.println("Received message: " + message);
    }
}
