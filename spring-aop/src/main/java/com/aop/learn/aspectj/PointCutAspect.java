package com.aop.learn.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author songshuiyang
 * @title: 命名切点
 * @description:
 * @date 2017/11/16 22:51
 */
@Aspect
public class PointCutAspect {

    /**
     * 引用了PointCut.inPkgGreetTo()切点
     */
    @Before("PointCut.inPkgGreetTo()")
    public void pkgGreetTo() {
        System.out.println("");
    }
}
