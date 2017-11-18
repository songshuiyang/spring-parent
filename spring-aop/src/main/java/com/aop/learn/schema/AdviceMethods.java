package com.aop.learn.schema;

/**
 * @author songshuiyang
 * @title: Schema 用作增强的方法
 * @description:
 * @date 2017/11/18 14:44
 */
public class AdviceMethods {

    public void preGreeting() {
        System.out.println("-------------前置增强");
    }

    public void afterGreeting(String retVal) {
        System.out.println("-------------后置增强,返回的参数" + retVal);
    }

}
