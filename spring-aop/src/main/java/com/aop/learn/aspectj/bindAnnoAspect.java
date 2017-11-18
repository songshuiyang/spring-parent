package com.aop.learn.aspectj;

import com.aop.learn.annotation.Author;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author songshuiyang
 * @title: 绑定类注解对象
 * @description:
 * @date 2017/11/18 13:19
 */
@Aspect
@Component
public class bindAnnoAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("@annotation(com.aop.learn.annotation.Author)")
    public void bindTypeAnnoObject(JoinPoint joinPoint) {
        logger.info("-------------------绑定类注解对象------------------");
        MethodSignature ms = (MethodSignature) joinPoint.getSignature();
        Method method = ms.getMethod();
        logger.info("使用了Author注解" + method.getAnnotation(Author.class).name());
        logger.info("-------------------绑定类注解对象------------------");
    }
}
