package com.karkaLearning.rohitkafkalearning.controller;

import com.karkaLearning.rohitkafkalearning.kafka.KafkaJsonProducer;
import com.karkaLearning.rohitkafkalearning.kafka.KafkaProducer;
import com.karkaLearning.rohitkafkalearning.payload.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class KafkaController {
    @Autowired
    private KafkaProducer producer;

    @Autowired
    private KafkaJsonProducer jsonProducer;

    @GetMapping("/sendMessage")
    public ResponseEntity<String> sendMessageToKafka(@RequestParam("message") String message) {
        producer.sendMessage(message);
        return ResponseEntity.ok("MESSAGE SENT TO KAFKA SUCCESSFULLY");
    }

    // http://localhost:8080/postJsonToKafka
    @PostMapping("/postJsonToKafka")
    public ResponseEntity<String> sendJsonToKafka(@RequestBody User user) {
        jsonProducer.sendJsonMessageToKafkaBroker(user);
        return ResponseEntity.ok("JSON PAYLOAD SENT TO KAFKA BROKER SUCCESSFULLY");
    }
}
