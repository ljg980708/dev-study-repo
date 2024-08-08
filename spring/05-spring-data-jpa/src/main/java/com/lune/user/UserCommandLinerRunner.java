package com.lune.user;

import com.lune.user.entity.User;
import com.lune.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class UserCommandLinerRunner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User user = new User();

        user.setEmail("example@example.com");
        user.setName("John Doe");

        userRepository.save(user);
    }
}
