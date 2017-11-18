package com.aop.learn.service;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/11/15 21:21
 */
public interface Writer {

    public void greetTo(String clientName);

    public void greetTo(String clientName, Integer age);

    public void serveTo(String clientName);

    public void nestTo();

    String name();
}
