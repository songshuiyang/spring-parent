package com.learn.ioc.controller;

import com.learn.ioc.demain.Car;
import com.learn.ioc.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/8/21 15:24
 */
@Controller
public class demoController {

    @Autowired(required = false)
    private DateUtils dateUtils;

    @Autowired
    @Qualifier("car1")
    private Car car;

    private Car car1;

    /**
     * 自动将Car传入方法入参
     * @param car1
     */
    @Lazy // 延迟依赖注入,延迟到调用此属性的时候才会注入属性值
    @Autowired
    public void setCar1(Car car1){
        this.car1 = car1;
    }

    /**
     * 对方法入参标注@Qualifier以指定注入Bean的名称
     * @param car
     */
    public void init(@Qualifier("car") Car car ){
        this.car1 = car;
    }


}
