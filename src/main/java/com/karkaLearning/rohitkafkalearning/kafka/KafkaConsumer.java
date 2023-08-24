package com.karkaLearning.rohitkafkalearning.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * THIS IS OUR KAFKA LISTNER
     * IT IS A KAFKA CONSUMER
     * ANY METHOD ANOTATED WITH ANOTATION @KafkaListener will receive any message arrives at kafka broker
     *
     * @param message
     */
//    @KafkaListener(topics = "rohitKafkaTopic", groupId = "myGroupId")
//    public void myKafkaListener(String message) {
//        logger.info("MESSAGE RECEIVED FROM CLUSTER : ", message);
//    }
}
