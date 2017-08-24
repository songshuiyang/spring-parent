package com.tx.dao;

/**
 * @author songshuiyang
 * @title: 数据库操作
 * @description:
 * @date 2017/8/24 22:15
 */
public interface AccountDao {
    void inMoney(String in, Double money);

    void outMoney(String out, Double money);
}