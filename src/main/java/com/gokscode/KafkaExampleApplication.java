package com.gokscode;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaExampleApplication.class, args);
    }

    // A SpringBoot interface that allows us to run custom code after Spring boot application
    // has started and all the beans are initialized.
    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
        return args -> {
            for(int i = 0;i <= 100; i++){
                kafkaTemplate.send("gokscode", "Hello Kafka :)" + i);
            }
        };
    }
}
