package com.shiro.learn.test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;
import org.junit.Test;
/**
 * @author songshuiyang
 * @title: 登录/退出
 * @description:
 * @date 2017/11/19 20:55
 */
public class LoginLogoutTest {

    /**
     *
     */
    @Test
    public void test1() {
        // 初始化SecurityManager工厂
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");

        // 接着获取SecurityManager并绑定到SecurityUtils，这是一个全局设置，设置一次即可；
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);

        // 得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证），自动绑定到当前线程
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");

        // 验证
        subject.login(token);

        // 断言是否已经登入
        Assert.assertEquals(true, subject.isAuthenticated());

        // 退出
        subject.logout();
    }

    /**
     * 单Realm配置 自定义Realm实现
     */
    @Test
    public void testCustomRealm() {

        // 初始化SecurityManager工厂
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-realm.ini");

        // 接着获取SecurityManager并绑定到SecurityUtils，这是一个全局设置，设置一次即可
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);

        // 得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证），自动绑定到当前线程
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("songshuiyang", "123");

        // 验证
        subject.login(token);

        // 断言是否已经登入
        Assert.assertEquals(true, subject.isAuthenticated());

        // 退出
        subject.logout();

    }

    /**
     * JDBC Realm使用
     */
    @Test
    public void testJDBCRealm() {

        // 初始化SecurityManager工厂
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shrio-jdbc.ini");

        // 接着获取SecurityManager并绑定到SecurityUtils，这是一个全局设置，设置一次即可
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);

        // 得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证），自动绑定到当前线程
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("songshuiyang", "123456");

        // 验证
        subject.login(token);

        // 断言是否已经登入
        Assert.assertEquals(true, subject.isAuthenticated());

        // 退出
        subject.logout();

    }



}
