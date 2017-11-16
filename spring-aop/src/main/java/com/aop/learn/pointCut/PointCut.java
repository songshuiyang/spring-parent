package com.aop.learn.pointCut;

import org.aspectj.lang.annotation.Pointcut;

/**
 * @author songshuiyang
 * @title: 命名切点
 * @description: 切点直接声明在增强方法处，这种切点声明方式称为匿名切点
 * 匿名切点只能在声明处使用，如果希望在其他地方重用一个切点，可以通过
 * @Pointcut注解及切面类方法对切点进行命名
 * @date 2017/11/16 22:41
 */
public class PointCut {
    // 方法的访问修饰符还控制了切点的可引用性,这种可引用性和类方法的可访问性相同
    @Pointcut("within(com.aop.learn.service.*)")
    private void inPackage() {
    }

    @Pointcut("execution(* greetTo(..))")
    protected void greetTo() {
    }

    @Pointcut("inPackage() && greetTo()") // 引用了本类中的切点
    public void inPkgGreetTo() {
    }
}
