package com.aop.learn.aspectj;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author songshuiyang
 * @title: 绑定抛出的异常
 * @description:
 * @date 2017/11/18 14:14
 */
@Aspect
@Component
public class ExpectionAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @AfterThrowing(value = "target(com.aop.learn.service.impl.NativeWaiter)", throwing = "e")
    public void bindException(IllegalArgumentException e) {
        logger.info("------------------绑定抛出的异常------------------");
        logger.info("异常message" + e.getMessage());
        logger.info("------------------绑定抛出的异常------------------");
    }
}
