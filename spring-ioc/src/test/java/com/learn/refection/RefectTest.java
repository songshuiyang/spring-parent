package com.learn.refection;

import com.learn.ioc.demain.Car;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author songshuiyang
 * @title: 反射
 * @description:
 * 可以通过编程的方式调用类的各项功能
 *
 *
 *
 * @date 2017/8/13 19:44
 */
public class RefectTest {

    public static void main(String[] args) throws Exception{
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class aClass = classLoader.loadClass("com.learn.ioc.demain.Car");
        Constructor constructor = aClass.getConstructor();
        Car car = (Car)constructor.newInstance();
        Method method = aClass.getMethod("setBrand",String.class);
        method.invoke(car,"奔驰");
        Method method1 = aClass.getMethod("setColor",String.class);
        method1.invoke(car,"红色");
        Method method2 = aClass.getMethod("setMaxSpeed",int.class);
        method2.invoke(car,200);
        System.out.println(car);
    }
}
