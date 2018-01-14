package com.smart.boot.groupAnno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author songshuiyang
 * @title: 组合注解
 * @description:
 * @date 2018/1/14 22:44
 */
public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        context.close();
    }
}
