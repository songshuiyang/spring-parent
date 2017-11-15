package com.aop.test.service;

import com.aop.test.BaseTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/11/15 22:04
 */
public class AspectTest extends BaseTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

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
}
