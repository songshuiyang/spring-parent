package com.aop.learn.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author songshuiyang
 * @title: @Aspect // 通过该注解将该类标识为一个切面
 * @description:
 * @date 2017/11/15 21:11
 */
@Component
@Aspect // 通过该注解将该类标识为一个切面
public class PreGreetingAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* greetTo(..))") // 定义切点和增强类型（前置增强,可以带任何参数，和任意的返回值）
    public void beforeGreeting() { // 增强的横切逻辑
        logger.info("How are you Aspect 使用前置增强");
    }

    @Around("execution(* *To(..))")
    public void joinPointAccess(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        logger.info("------------开始使用环绕增强-------------");
        logger.info("参数： " + proceedingJoinPoint.getArgs()[0]);
        logger.info("参数： " + proceedingJoinPoint.getArgs()[1]);
        for (Object o : proceedingJoinPoint.getArgs()) {
            logger.info("" + o);
        }
        logger.info("getClass" + proceedingJoinPoint.getTarget().getClass());
        logger.info("------------环绕增强 执行方法体开始-------------");
        proceedingJoinPoint.proceed();
        logger.info("------------环绕增强 执行方法体结束-------------");
    }

    @Around("execution(* *To(..)) && args(name,age)")
    public void joinPointAccess(String name, Integer age) throws Throwable {
        logger.info("------------环绕增强参数绑定-------------");
        logger.info("------------环绕增强参数绑定-------------" + name);
        logger.info("------------环绕增强参数绑定-------------" + age);
    }

}
