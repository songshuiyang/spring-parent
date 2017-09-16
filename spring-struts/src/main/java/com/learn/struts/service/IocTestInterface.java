package com.learn.struts.service;

import java.util.List;

/**
 * @author songshuiyang
 * @title: 编写一个接口，Action方法依赖这个接口，通过调用接口中的方法获取List
 * @description:
 * @date 2017/9/16 20:05
 */
public interface IocTestInterface {

    public List getList();
}
