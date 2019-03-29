package com.ly.common.bean;

import javax.inject.Inject;

/**
 * Author:Administrator
 * Time:2019/3/28 16:50
 * Describption:This is User
 * Version: 1.0.0
 */
public class User {

    private String name;
    private int age;
    @Inject
    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

 