package com.shiro.learn.test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/11/27 20:52
 */
public class ShiroTest {

    private Subject login(String userName, String password) {
        SecurityManager securityManager = new IniSecurityManagerFactory("classpath:shiro/shiro1.ini").getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(userName, password);
        try {
            subject.login(usernamePasswordToken);
        } catch (UnknownAccountException e) {
            System.out.println("用户名不存在");
        } catch (IncorrectCredentialsException e) {
            System.out.println("用户密码不存在");
        }
        return subject;
    }

    /**
     * role
     */
    @Test
    public void testBase() {
        Subject subject = login("song", "123");
        PrincipalCollection collection = subject.getPrincipals();
        System.out.println(collection.asList());
        System.out.println(collection.getRealmNames());
        System.out.println(subject.getPrincipal());
        System.out.println("是否有某个角色" + subject.hasRole("r1"));
        System.out.println("是否有所有以下的角色" + subject.hasRoles(Arrays.asList("r1", "r2", "r3"))[2]);
        subject.checkRole("r3");
    }

    /**
     * permitted
     *
     */
    @Test
    public void testBase1() {
        Subject subject = login("song", "123");
        PrincipalCollection collection = subject.getPrincipals();
        System.out.println("是否有某个权限" + subject.isPermitted("user:create"));
        System.out.println("是否有某个权限" + subject.isPermitted("user:view"));
        System.out.println("是否有某个权限" + subject.isPermitted("topic:view:sdfsa"));
    }
}
