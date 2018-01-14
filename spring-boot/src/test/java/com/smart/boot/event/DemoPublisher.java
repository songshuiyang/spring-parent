package com.smart.boot.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author songshuiyang
 * @title: 事件发布类
 * @description:
 * @date 2018/1/14 20:12
 */
@Component
public class DemoPublisher {
    /**
     * 注入ApplicationContext来发布事件
     */
    @Autowired
    ApplicationContext context;

    /**
     * 发布事件
     *
     * @param msg
     */
    public void publish(String msg) {
        context.publishEvent(new DemoEvent(this, msg));
    }
}
