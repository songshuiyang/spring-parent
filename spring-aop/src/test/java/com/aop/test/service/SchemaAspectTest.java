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

    private ApplicationContext context;

    public SchemaAspectTest() {
        this.context = new ClassPathXmlApplicationContext("classpath:/spring/applicationContext-schema.xml");
    }

    /**
     * 基于Schemea 配置切面
     */
    @Test
    public void test1() {
        Writer writer = (Writer) context.getBean("nativeWaiter");
        writer.greetTo("基于Schemea 配置切面", 18);
    }

    /**
     * 基于Schemea 配置后置增强
     */
    @Test
    public void test2() {
        Writer writer = (Writer) context.getBean("nativeWaiter");
        writer.name();
    }

    /**
     * 绑定连接点信息
     */
    @Test
    public void test3() {
        Writer writer = (Writer) context.getBean("nativeWaiter");
        writer.greetTo("Schema 实现绑定连接点信息");
    }
}
