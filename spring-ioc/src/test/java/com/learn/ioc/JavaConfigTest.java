package com.learn.ioc;

import com.learn.ioc.beanConfig.BossConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author songshuiyang
 * @title: 基于Java类的配置信息启动Spring容器
 * @description:
 * @date 2017/8/21 18:44
 */
public class JavaConfigTest {

    private static Logger logger = LoggerFactory.getLogger(JavaConfigTest.class);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BossConfig.class);
        String [] beanNames = context.getBeanDefinitionNames();
        for(String s : beanNames){
            logger.info("Bean的名字{}",s);
        }
    }

}
