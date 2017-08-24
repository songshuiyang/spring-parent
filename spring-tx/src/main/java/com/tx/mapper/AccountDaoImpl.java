package com.tx.mapper;

import com.tx.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/8/24 22:19
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    public void outMoney(String out, Double money) {
        String sql = "update account set money=money-? where name=?";
        this.getJdbcTemplate().update(sql, money, out);
    }

    public void inMoney(String in, Double money) {
        String sql = "update account set money=money+? where name=?";
        this.getJdbcTemplate().update(sql, money, in);
    }
}
