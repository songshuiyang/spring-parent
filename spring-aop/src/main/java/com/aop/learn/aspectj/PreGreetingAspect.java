package com.aop.learn.aspectj;

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
        logger.info("How are you Aspect");
    }


}
