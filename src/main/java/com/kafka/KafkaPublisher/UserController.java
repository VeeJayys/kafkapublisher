package com.kafka.KafkaPublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping
    public String createUser(@RequestBody List<User> users){
        return userService.saveUser(users);
    }
}
