package com.aop.learn.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author songshuiyang
 * @title: execution() 是最常见的切点函数
 * @description:
 * @date 2017/11/15 23:05
 */
@Aspect
@Component
public class ExecutionAspect {

    /**
     * 匹配所有目标类的public方法
     */
    @Before("execution(public * *(..))")
    public void beforeAspect() {

    }

    /**
     * 匹配所有以To为后缀的方法
     */
    @Before("execution(* *To(..))")
    public void beforeAspect1() {

    }

    /**
     * 匹配Waiter接口中的所有方法
     */
    @Before("execution(* com.aop.learn.service.Writer.*(..))")
    public void beforeAspect2() {

    }

    /**
     * 匹配Waiter接口中及其实现类的方法
     */
    @Before("execution(* com.aop.learn.service.Writer+.*(..))")
    public void beforeAspect3() {

    }

    /**
     * 匹配 com.aop.learn.service 包下所有类的所有方法
     */
    @Before("execution(* com.aop.learn.service.*(..))")
    public void beforeAspect4() {

    }

    /**
     * 匹配 com.aop.learn.service 包,子孙包下所有类的所有方法
     */
    @Before("execution(* com.aop.learn.service..*(..))")
    public void beforeAspect5() {

    }

    /**
     * 匹配 包名前缀为com的任何包下类名后缀为ive的方法,方法必须以Smart为前缀
     */
    @Before("execution(* com..*.*ive.Smart*(..))")
    public void beforeAspect6() {

    }

    /**
     * 匹配 save(String name,int age) 函数
     */
    @Before("execution(* save(String,int))")
    public void beforeAspect7() {

    }

    /**
     * 匹配 save(String name,*) 函数 第二个参数为任意类型
     */
    @Before("execution(* save(String,*))")
    public void beforeAspect8() {

    }

    /**
     * 匹配 save(String name,..) 函数 除第一个参数固定外,接受后面有任意个入参且入参类型不限
     */
    @Before("execution(* save(String,..))")
    public void beforeAspect9() {

    }

    /**
     * 匹配 save(String+) 函数  String+ 表示入参类型是String的子类
     */
    @Before("execution(* save(String+))")
    public void beforeAspect10() {

    }

    /**
     * 切点符合运算 ( && 与运算) (|| 或运算)
     */
    @Before("execution(public * *(..))" + " && execution(public * *(..))")
    public void beforeAspect11() {

    }
}
