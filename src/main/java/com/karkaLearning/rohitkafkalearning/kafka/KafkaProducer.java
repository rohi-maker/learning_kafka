package com.karkaLearning.rohitkafkalearning.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    // The below kafka template is spring boot provided class, using which we can send and received the messages to/from kafka
    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;


    public void sendMessage(String message) {
        kafkaTemplate.send("rohitKafkaTopic", message);
        logger.info("SENT MESSAGE TO KAFKA CLUSTER TO TOPIC rohitKafkaTopic");
    }
}
