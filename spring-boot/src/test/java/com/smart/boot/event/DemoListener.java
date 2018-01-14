package com.smart.boot.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author songshuiyang
 * @title: 事件监听器
 * @description: 实现ApplicationListener接口, 并指定监听的事件类型
 * @date 2018/1/14 20:09
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    /**
     * 对消息进行接受处理
     *
     * @param event
     */
    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();
        System.out.println("DemoListener 接受到了消息" + msg);
        event.todoSomethings();
        System.out.println("正在做第二件事");
    }
}
