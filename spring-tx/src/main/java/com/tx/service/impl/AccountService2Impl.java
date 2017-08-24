package com.tx.service.impl;

import com.tx.dao.AccountDao;
import com.tx.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * @author songshuiyang
 * @title: 编程式事务实现
 * @description:
 * @date 2017/8/24 23:10
 */
@Service
public class AccountService2Impl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private TransactionTemplate transactionTemplate;

    /**
     * @param out   转出账号
     * @param in    转入账号
     * @param money 转账金额
     */
    public void transfer(final String out, final String in, final Double money) {
        /**
         * 在这里面进行事务操作
         * 因为需要在匿名内部类中使用参数，所以给参数加上final关键字
         */
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                accountDao.inMoney(in, money);
                accountDao.outMoney(out, money);
            }
        });

    }
}
