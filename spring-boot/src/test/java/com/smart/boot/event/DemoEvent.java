package com.smart.boot.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author songshuiyang
 * @title: 自定义事件
 * @description:
 * @date 2018/1/14 20:06
 */
public class DemoEvent extends ApplicationEvent {

    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 去做一些事
     */
    public void todoSomethings() {
        System.out.println("正在做第一件事 , 做完需要做第二件事");
    }


}
