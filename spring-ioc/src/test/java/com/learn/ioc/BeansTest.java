package com.learn.ioc;


import com.learn.ioc.demain.Boss;
import com.learn.ioc.demain.Car;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;


/**
 * @author songshuiyang
 * @title: 测试BeanFactory
 * @description:
 * @date 2017/8/19 19:23
 */
public class BeansTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void getBeans(){
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource resource = resolver.getResource("classpath:beans.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);
        logger.info("init BeanFactory");
        Car car = factory.getBean("car",Car.class);
        logger.debug(car.toString());

        Boss boss = factory.getBean("boss",Boss.class);
        logger.debug(boss.toString());

        logger.debug("非静态工厂方法注入");
        Car car1 = factory.getBean("car1",Car.class);
        logger.debug(car1.toString());

        logger.debug("静态工厂方法注入");
        Car car2 = factory.getBean("car2",Car.class);
        logger.debug(car2.toString());

        logger.debug("集合类型属性");
        Boss boss1 = factory.getBean("boss1",Boss.class);
        logger.debug(boss1.toString());

        logger.debug("测试继承关系");
        Car car3 = factory.getBean("car3",Car.class);
        logger.debug(car3.toString());


    }
    @Test
    public void getBeansByAnnotation(){
        ApplicationContext application = new AnnotationConfigApplicationContext(Beans.class);
        Car car = application.getBean(Car.class);
        logger.debug(car.toString());
    }

}
