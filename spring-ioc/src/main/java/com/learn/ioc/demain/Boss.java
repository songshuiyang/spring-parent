package com.learn.ioc.demain;

import java.util.List;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/8/19 21:41
 */
public class Boss {
    private String name;

    private int age;

    private Car car;

    private List<Car> carList;

    public Boss(){

    }

    public Boss(String name, int age, Car car, List<Car> carList) {
        this.name = name;
        this.age = age;
        this.car = car;
        this.carList = carList;
    }

    public Boss(String name, int age, Car car) {
        this.name = name;

        this.age = age;
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                ", carList=" + carList +
                '}';
    }
}
