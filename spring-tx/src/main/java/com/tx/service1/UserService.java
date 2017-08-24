package com.tx.service1;

/**
 * @author songshuiyang
 * @title: 基于AspectJ的XML方式
 * @description:
 * @date 2017/8/24 23:55
 */
public interface UserService {
    /**
     * @param out   转出账号
     * @param in    转入账号
     * @param money 转账金额
     */
    void updateBalance(String out, String in, Double money) throws Exception;
}
