package com.aop.learn.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/11/15 22:49
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface NeedTest {
    boolean value() default true;
}
