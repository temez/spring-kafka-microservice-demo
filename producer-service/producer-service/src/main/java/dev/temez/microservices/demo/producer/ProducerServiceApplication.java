package dev.temez.microservices.demo.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "dev.temez.microservices.demo")
public class ProducerServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProducerServiceApplication.class);
  }
}
