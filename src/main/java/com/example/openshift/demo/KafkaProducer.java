package com.example.openshift.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
    @Autowired
    private final KafkaTemplate<String, Object> kafkaTemplate;
    private final String TOPIC_NAME= "test-topic";

    public KafkaProducer(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(Employee message) {
        kafkaTemplate.send(TOPIC_NAME, message);
        System.out.println("Message " + message +
                " has been sucessfully sent to the topic: " + TOPIC_NAME);
    }
}
