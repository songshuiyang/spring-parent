package com.aop.learn.schema;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author songshuiyang
 * @title: aop:advisor 是切点和增强的复合体,仅包含一个切点和增强
 * @description:
 * @date 2017/11/18 15:37
 */
public class AdvisorMethods implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object taget) throws Throwable {
        System.out.println("--------------执行aop:advisor增强----------------");
        System.out.println("获取的参数" + args[0]);
    }
}
