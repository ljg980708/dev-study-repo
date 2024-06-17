package com.lune.spring_bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class MyBean {
    @PostConstruct
    public void init() {
        System.out.println("Bean is going through init.");
    }

    public void doSomething() {
        System.out.println("Hello, Spring Bean!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean will destroy now.");
    }
}
