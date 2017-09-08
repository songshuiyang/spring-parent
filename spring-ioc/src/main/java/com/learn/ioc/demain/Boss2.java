package com.learn.ioc.demain;

/**
 * @author songshuiyang
 * @title: 引用Beans的属性值
 * @description:
 * @date 2017/9/7 17:16
 */
public class Boss2 {
    private String name;
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

    public Boss2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Boss2() {

    }

    @Override
    public String toString() {
        return "Boss2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
