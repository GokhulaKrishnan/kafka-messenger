package com.gokscode;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "gokscode",
            groupId = "groupid"
    )
    void Listener(String data){
        System.out.println("Listener received: " + data);
    }
}
