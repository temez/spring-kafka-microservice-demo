package dev.temez.microservices.demo.producer.service;

import dev.temez.microservices.demo.producer.api.messaging.TestMessage;
import dev.temez.microservices.demo.producer.api.messaging.configuration.KafkaTopicConfiguration;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;
import lombok.extern.log4j.Log4j2;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public final class KafkaProducerService {

  @NotNull KafkaTemplate<String, TestMessage> kafkaTemplate;

  @NonFinal
  @Value("${server.port}")
  int port;

  @NonFinal
  @Value("${spring.application.name}")
  String applicationName;

  @Scheduled(initialDelay = 5000, fixedDelay = 5)
  private void sendMessage() {
    TestMessage message = TestMessage.builder()
        .producerApplication(String.format("%s:%d", applicationName, port))
        .build();
    kafkaTemplate.send(KafkaTopicConfiguration.TEST_TOPIC, message);
    log.info("Sent message {}", message);
  }
}
