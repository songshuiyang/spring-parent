package com.learn.ioc;

import com.learn.ioc.demain.Boss1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author songshuiyang
 * @title: 测试基于注解配置中引入属性
 * @description:
 * @date 2017/9/7 16:54
 */
public class Boss1Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
        Boss1 boss = (Boss1) context.getBean("boss1");
        System.out.println(boss.toString());
    }
}
