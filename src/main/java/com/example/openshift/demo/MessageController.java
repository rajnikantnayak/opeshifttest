package com.example.openshift.demo;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
public class MessageController {
    @Autowired
    private KafkaProducer kafkaProducer;
    @Autowired
    private KafkaTemplate<String, FlightInfo> kafkaTemplate;
    @PostMapping("/send")
    public void sendMessageToKafka(@RequestBody Employee employee) {
        String msg = "test msg1";
        FlightInfo flightInfo = new FlightInfo(100, "DHL0001", "Carrier");
        ProducerRecord<String, FlightInfo> producerRecord = new ProducerRecord("test-topic", 0, "first", flightInfo);
        CompletableFuture<SendResult<String, FlightInfo>> future = kafkaTemplate.send(producerRecord);
    }


}
