package com.lune.component_example;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    public void executeService() {
        System.out.println("User Service is executed!");
    }
}
