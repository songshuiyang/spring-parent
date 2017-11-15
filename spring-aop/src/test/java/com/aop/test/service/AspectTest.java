package com.aop.test.service;

import com.aop.learn.service.Writer;
import com.aop.test.BaseTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author songshuiyang
 * @title: 基于spring配置使用@AspectJ切面
 * @description:
 * @date 2017/11/15 22:04
 */
public class AspectTest extends BaseTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Writer writer;

    /**
     * 查看注入了那些类
     */
    @Test
    public void test() {
        logger.info("--------------------------bean--------------------------");
        for (String beanName : this.applicationContext.getBeanDefinitionNames()) {
            logger.info(beanName);
        }
        logger.info("--------------------------bean--------------------------");
    }

    /**
     * 基于spring配置使用@AspectJ切面
     */
    @Test
    public void test1() {
        writer.serveTo("songshuiyang");
        writer.greetTo("songshuiyang");
    }
}
