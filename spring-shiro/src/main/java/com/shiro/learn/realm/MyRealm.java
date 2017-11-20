package com.shiro.learn.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

/**
 * @author songshuiyang
 * @title: Realm：域
 * @description: Shiro从从Realm获取安全数据（如用户、角色、权限）
 * 就是说SecurityManager要验证用户身份，
 * 那么它需要从Realm获取相应的用户进行比较以确定用户身份是否合法；
 * 也需要从Realm得到用户相应的角色/权限进行验证用户是否能进行操作；
 * 可以把Realm看成DataSource，即安全数据源
 * @date 2017/11/20 22:10
 */
public class MyRealm implements Realm {
    /**
     * 返回一个唯一的Realm名字
     *
     * @return
     */
    @Override
    public String getName() {
        return "myRealm";
    }

    /**
     * 判断此Realm是否支持此Token
     *
     * @param token
     * @return
     */
    @Override
    public boolean supports(AuthenticationToken token) {
        // 仅支持UsernamePasswordToken类型的Token
        return token instanceof UsernamePasswordToken;
    }

    /**
     * 根据Token获取认证信息
     *
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        // 得到用户名
        String userName = (String) token.getPrincipal();
        // 得到密码
        String password = new String((char[]) token.getCredentials());
        if (!"songshuiyang".equals(userName)) {
            // 用户名错误
            throw new UnknownAccountException();
        }
        // 密码错误
        if (!"123".equals(password)) {
            throw new IncorrectCredentialsException();
        }
        // 登入成功
        return new SimpleAuthenticationInfo(userName, password, getName());
    }
}
