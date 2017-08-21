package com.learn.ioc.beanConfig;

import com.learn.ioc.demain.Boss;
import com.learn.ioc.demain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author songshuiyang
 * @title: 基于Java类的配置
 * @description:
 * @date 2017/8/21 18:52
 */
@Configuration
@Import(CarConfig.class)                // 引用其他JavaConfig配置类
@ImportResource("classpath:beans1.xml") // 引入XML配置文件
public class BossConfig {

    @Bean(name = "boss1")
    @Autowired
    public Boss createBoss(Car car) {
        Boss boss = new Boss("基于注解的方式构建Boss", 18, car);
        return boss;
    }
}
