package com.example.kafka;

import com.example.kafka.producer.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class KafkaDemoApplication implements CommandLineRunner {
    @Autowired
    private KafkaProducerService kafkaProducerService;

    public static void main(String[] args) {
        SpringApplication.run(KafkaDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String message = "Hello, Kafka!";
        kafkaProducerService.sendMessage(message);
        System.out.println("Sent message: " + message);
    }
}