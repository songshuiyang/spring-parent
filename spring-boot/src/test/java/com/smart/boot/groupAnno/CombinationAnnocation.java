package com.smart.boot.groupAnno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * @author songshuiyang
 * @title: 组合注解
 * @description:
 * @date 2018/1/14 22:20
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@ComponentScan
public @interface CombinationAnnocation {
    String[] value() default {};
}
