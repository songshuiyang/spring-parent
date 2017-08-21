package com.learn.ioc;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/8/21 15:01
 */
public class AnnotationCarConfig {

    private static ApplicationContext context;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void testLoadApplication(){
        context = new ClassPathXmlApplicationContext(new String[]{"classpath:applicationContext.xml"});
        String [] beanNames = context.getBeanDefinitionNames();
        int allBeansCount = context.getBeanDefinitionCount();
        logger.info("所有Beans的数量是 {} ",allBeansCount);
        for(String s : beanNames){

            Class<?> aClass = context.getType(s);
            logger.info("Bean的名字{}",s);
        }
        logger.debug("--------------------开始关闭容器");
        ((ClassPathXmlApplicationContext)context).destroy();
    }
    @Test
    public void testLoadController(){
        context = new ClassPathXmlApplicationContext(new String[]{"classpath:applicationContext-mvc.xml"});
        String [] beanNames = context.getBeanDefinitionNames();
        int allBeansCount = context.getBeanDefinitionCount();
        logger.info("所有Beans的数量是 {} ",allBeansCount);
        for(String s : beanNames){

            Class<?> aClass = context.getType(s);
            logger.info("Bean的名字{}",s);
        }
    }


}
