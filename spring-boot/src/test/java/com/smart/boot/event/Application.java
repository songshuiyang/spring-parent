package com.smart.boot.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author songshuiyang
 * @title: 实现
 * @description:
 * @date 2018/1/14 20:15
 */
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("hello songshuiyang");
        context.close();
    }
}
