package dev.temez.microservices.demo.producer.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableKafka
@Configuration
@EnableScheduling
public class ProducerServiceConfiguration {


}
