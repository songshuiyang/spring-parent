package com.tx.service2;

/**
 * @author songshuiyang
 * @title: 基于注解的方式
 * @description:
 * @date 2017/8/25 0:08
 */
public interface UserService1 {
    /**
     * @param out   转出账号
     * @param in    转入账号
     * @param money 转账金额
     */
    void transfer(String out, String in, Double money);
}
