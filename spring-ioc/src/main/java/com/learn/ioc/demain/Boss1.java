package com.learn.ioc.demain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author songshuiyang
 * @title: 在java类的配置中引用属性
 * @description:
 * @date 2017/9/7 16:47
 */
@Component
public class Boss1 {

    @Value("${name}")
    private String name;

    @Value("${age}")
    private int age;

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

    public Boss1() {
    }

    @Override
    public String toString() {
        return "Boss1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
