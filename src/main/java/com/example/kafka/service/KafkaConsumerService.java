package com.example.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    private static final String TOPIC = "myTopic";

    @KafkaListener(topics = TOPIC, groupId = "my-group")
    public void consume(String message) {
        System.out.println("Received message: " + message);
    }
}

