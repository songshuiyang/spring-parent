package com.aop.learn.aspectj;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author songshuiyang
 * @title: 后置增强绑定返回值
 * @description:
 * @date 2017/11/18 13:52
 */
@Aspect
@Component
public class AfterAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * @param returnVal
     */
    @AfterReturning(value = "target(com.aop.learn.service.impl.NativeWaiter)", returning = "returnVal")
    public void bindReturnValue(String returnVal) {
        logger.info("--------------后置增强绑定返回值-----------------");
        logger.info("aop后置增强绑定返回值" + returnVal);
        logger.info("--------------后置增强绑定返回值-----------------");
    }


}
