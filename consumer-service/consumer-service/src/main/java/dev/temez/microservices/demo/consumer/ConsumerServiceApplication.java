package dev.temez.microservices.demo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "dev.temez.microservices.demo")
public class ConsumerServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConsumerServiceApplication.class);
  }
}
