package com.aop.test.service;

import com.aop.learn.service.Writer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author songshuiyang
 * @title: 基于Schema 配置切面
 * @description:
 * @date 2017/11/18 14:56
 */
public class SchemaAspectTest {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spring/applicationContext-schema.xml");

        Writer writer = (Writer) context.getBean("nativeWaiter");
        writer.greetTo("基于Schemea 配置切面", 18);


    }
}
