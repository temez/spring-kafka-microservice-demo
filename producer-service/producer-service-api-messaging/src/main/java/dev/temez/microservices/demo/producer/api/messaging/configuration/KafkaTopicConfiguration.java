package dev.temez.microservices.demo.producer.api.messaging.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfiguration {

  public static final String TEST_TOPIC = "test-topic";

  @Bean
  public NewTopic exampleTopic() {
    return new NewTopic(TEST_TOPIC, 2, (short) 1);
  }
}
