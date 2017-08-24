package com.tx.service;

/**
 * @author songshuiyang
 * @title: 逻辑处理操作
 * @description:
 * @date 2017/8/24 22:17
 */
public interface AccountService {
    /**
     * @param out   转出账号
     * @param in    转入账号
     * @param money 转账金额
     */
    void transfer(String out, String in, Double money);
}
