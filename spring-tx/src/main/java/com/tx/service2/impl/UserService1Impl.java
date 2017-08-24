package com.tx.service2.impl;

import com.tx.dao.AccountDao;
import com.tx.service2.UserService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author songshuiyang
 * @title: 基于注解的方式
 * @description:
 * @date 2017/8/25 0:08
 */
@Service
public class UserService1Impl implements UserService1 {

    @Autowired
    private AccountDao accountDao;

    /**
     * @param out   转出账号
     * @param in    转入账号
     * @param money 转账金额
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public void transfer(String out, String in, Double money) {
        accountDao.inMoney(in, money);
        accountDao.inMoney(in, money);
        String s = null;
        s.getBytes();
        accountDao.outMoney(out, money);
    }
}
