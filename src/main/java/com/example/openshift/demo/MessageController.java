package com.example.openshift.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @Autowired
    private KafkaProducer kafkaProducer;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    @PostMapping("/send")
    public void sendMessageToKafka() {
        String msg = "test msg1";
        kafkaTemplate.send("test-topic", msg);
    }
}
