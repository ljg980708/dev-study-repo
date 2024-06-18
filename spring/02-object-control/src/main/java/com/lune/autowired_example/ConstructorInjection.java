package com.lune.autowired_example;

import com.lune.autowired_example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ConstructorInjection {
    private final UserRepository userRepository;

    @Autowired
    public ConstructorInjection(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
