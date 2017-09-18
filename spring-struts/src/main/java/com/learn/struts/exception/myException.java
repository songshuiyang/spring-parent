package com.learn.struts.exception;

/**
 * @author songshuiyang
 * @title: 自定义异常
 * @description:
 * @date 2017/9/18 16:21
 */
public class myException extends Exception {

    @Override
    public String getMessage() {
        return "自定义异常";
    }

    @Override
    public void printStackTrace() {
        System.out.println("*************************************** Exception ******************************");
        super.printStackTrace();
    }
}
