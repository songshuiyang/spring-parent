package com.aop.learn.aspectj;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author songshuiyang
 * @title: @annotation切点函数
 * @description:
 * @date 2017/11/15 22:51
 */
@Aspect
@Component
public class AnnotationAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 后置增强切面
     */
    @AfterReturning("@annotation(com.aop.learn.annotation.NeedTest)")
    public void needTestFun() {
        logger.info(" @annotation切点函数 NeedTest注解后置增强");
    }
}
