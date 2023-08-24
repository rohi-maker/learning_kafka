package com.karkaLearning.rohitkafkalearning.kafka;

import com.karkaLearning.rohitkafkalearning.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaJsonProducer {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    public void sendJsonMessageToKafkaBroker(User user) {
        Message<User> message = MessageBuilder.withPayload(user).setHeader(KafkaHeaders.TOPIC, "rohitKafkaTopic").build();
        kafkaTemplate.send(message);
        logger.info("MESSAGE SENT TO KAFKA BROKER: ", user.toString());
    }

}
