package com.tx.service1.impl;

import com.tx.dao.AccountDao;
import com.tx.service1.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author songshuiyang
 * @title: 基于AspectJ的XML方式
 * @description:
 * @date 2017/8/24 23:55
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private AccountDao accountDao;

    /**
     * @param out   转出账号
     * @param in    转入账号
     * @param money 转账金额
     */
    public void updateBalance(String out, String in, Double money) throws Exception {
        accountDao.inMoney(in, money);
        accountDao.inMoney(in, money);
        String s = null;
        s.getBytes();
        accountDao.outMoney(out, money);
    }
}
