package com.learn.cache.service;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/8/24 18:44
 */
public class UserServiceImplTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void UserMain(){
        ApplicationContext context =new ClassPathXmlApplicationContext("spring/applicationContext-cache.xml");
        UserServiceImpl userService = (UserServiceImpl) context.getBean(UserServiceImpl.class);
        logger.debug("第一次调用");
        logger.debug(userService.getUserById("dd").toString());
        logger.debug("第二次调用");
        logger.debug(userService.getUserById("dd").toString());
    }



}
