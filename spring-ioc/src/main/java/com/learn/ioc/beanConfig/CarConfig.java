package com.learn.ioc.beanConfig;

import com.learn.ioc.demain.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author songshuiyang
 * @title: 基于Java类的配置
 * @description:
 * @date 2017/8/19 20:19
 */
@Configuration
public class CarConfig {

    @Bean(name = "car")
    public Car createCar() {
        Car car = new Car();
        car.setBrand("基于注解的方式构建Beans");
        car.setColor("Annotation");
        car.setMaxSpeed(110);
        return car;
    }
}
