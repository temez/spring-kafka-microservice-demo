package dev.temez.microservices.demo.consumer.service;

import dev.temez.microservices.demo.producer.api.messaging.TestMessage;
import dev.temez.microservices.demo.producer.api.messaging.configuration.KafkaTopicConfiguration;
import lombok.extern.log4j.Log4j2;
import org.jetbrains.annotations.NotNull;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public final class KafkaConsumerService {

  @KafkaListener(topics = KafkaTopicConfiguration.TEST_TOPIC)
  public void handleOrderEvent(@NotNull TestMessage message) {
    log.info("Received {}", message);
  }
}
