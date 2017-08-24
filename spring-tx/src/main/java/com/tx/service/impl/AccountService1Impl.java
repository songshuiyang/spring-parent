package com.tx.service.impl;

import com.tx.dao.AccountDao;
import com.tx.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author songshuiyang
 * @title: 联通性
 * @description:
 * @date 2017/8/24 22:17
 */
@Service
public class AccountService1Impl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    /**
     * @param out   转出账号
     * @param in    转入账号
     * @param money 转账金额
     */
    public void transfer(String out, String in, Double money) {
        accountDao.inMoney(in, money);
        accountDao.outMoney(out, money);
    }
}
