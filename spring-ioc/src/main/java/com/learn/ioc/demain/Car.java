package com.learn.ioc.demain;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/8/13 19:47
 */
public class Car {
    private String brand;
    private String color;
    private int maxSpeed;

    public Car createHongQiCar(){
        Car car = new Car();
        car.setBrand("红旗");
        car.setColor("红色");
        car.setMaxSpeed(120);
        return car;
    }

    public static Car createStaticHongQiCar(){
        Car car = new Car();
        car.setBrand("静态汽车");
        car.setColor("红色");
        car.setMaxSpeed(120);
        return car;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
