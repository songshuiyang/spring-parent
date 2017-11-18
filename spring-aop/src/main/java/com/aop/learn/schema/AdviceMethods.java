package com.aop.learn.schema;

/**
 * @author songshuiyang
 * @title: Schema 用作增强的方法
 * @description:
 * @date 2017/11/18 14:44
 */
public class AdviceMethods {
    /**
     * 前置增强
     */
    public void preGreeting() {
        System.out.println("-------------前置增强");
    }

    /**
     * 后置增强
     *
     * @param retVal
     */
    public void afterGreeting(String retVal) {
        System.out.println("-------------后置增强,返回的参数" + retVal);
    }

    /**
     * 绑定连接点信息
     *
     * @param clientName
     */
    public void bindParmGreet(String clientName) {
        System.out.println("-------------绑定连接点信息 的参数" + clientName);

    }

}
