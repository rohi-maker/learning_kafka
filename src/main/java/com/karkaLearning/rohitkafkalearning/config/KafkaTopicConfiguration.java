package com.karkaLearning.rohitkafkalearning.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * A kafka topic is basically used for the identification of messages
 * We create multiple topics in kafka cluster/broker.
 * And after there are topics in our kafka cluster, we can send messages to these topics.
 * And consumers can consume/receive messages from these topics
 */
@Configuration
public class KafkaTopicConfiguration {

    // In below code we have crated kafka topic with name "rohitKafkaTopic" in our kafka cluster/broker/server
    @Bean
    public NewTopic myKafkaTopic() {
        return TopicBuilder.name("rohitKafkaTopic").build();
    }
}
