package com.kafka.KafkaPublisher;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private KafkaTemplate<String,User> kafkaTemplate;
    public String saveUser(List<User> users){
        for (User u:users){
            System.out.println("Printing now");
           kafkaTemplate.send(KafkaConstants.TOPIC,u);
        }
        return "Message published to kafka";
    }
}
