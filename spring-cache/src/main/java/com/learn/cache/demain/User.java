package com.learn.cache.demain;

import java.io.Serializable;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/8/24 18:16
 */
public class User implements Serializable {
    private String userId;
    private String userName;
    private int age;

    public User(String userId, String userName, int age) {
        this.userId = userId;
        this.userName = userName;
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
