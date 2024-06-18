package com.lune.autowired_example;

import com.lune.autowired_example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class SetterInjection {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
