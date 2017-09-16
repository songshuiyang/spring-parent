package com.learn.struts.service.impl;

import com.learn.struts.service.IocTestInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * @author songshuiyang
 * @title: 实现IocTestInterface接口的类，用来提供数据
 * @description:
 * @date 2017/9/16 20:12
 */
public class IocTestImpl implements IocTestInterface {
    public List getList() {
        List l = new ArrayList();
        l.add("abc");
        l.add("def");
        l.add("hig");
        return l;
    }
}
