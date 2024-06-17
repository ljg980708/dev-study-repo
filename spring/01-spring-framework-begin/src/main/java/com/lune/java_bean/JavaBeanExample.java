package com.lune.java_bean;

import java.io.Serializable;

public class JavaBeanExample implements Serializable {

    private Integer id;

    public JavaBeanExample() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
