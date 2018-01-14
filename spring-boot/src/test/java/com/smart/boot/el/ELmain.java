package com.smart.boot.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2018/1/14 15:34
 */
public class ELmain {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ELConfig.class);
        ELConfig elConfig = context.getBean(ELConfig.class);
        elConfig.print();
        context.close();

    }
}
