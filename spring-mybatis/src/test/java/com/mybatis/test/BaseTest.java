package com.mybatis.test;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/8/24 19:41
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring/applicationContext.xml")
public class BaseTest extends AbstractJUnit4SpringContextTests {

    public Logger logger = LoggerFactory.getLogger(this.getClass());

    public BaseTest() {
        logger.info("----------------------------启动测试类------------------------");
    }

}
