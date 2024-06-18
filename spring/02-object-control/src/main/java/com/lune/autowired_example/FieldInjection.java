package com.lune.autowired_example;

import com.lune.autowired_example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class FieldInjection {

    @Autowired
    private UserRepository userRepository;
}
