package com.smart.service.impl;

import com.smart.dao.LoginLogDao;
import com.smart.dao.UserDao;
import com.smart.domain.LoginLog;
import com.smart.domain.User;
import com.smart.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/8/13 12:09
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Resource
    private LoginLogDao loginLogDao;

    /**
     *
     * @param userName
     * @param password
     * @return
     */
    public boolean hasMatchUser(String userName, String password) {
        int matchCount =userDao.getMatchCount(userName, password);
        return matchCount > 0;
    }
    public User findUserByName(String name){
        return userDao.findUserByUserName(name);
    }
    /**
     *
     * @param user
     */
    @Transactional
    public void loginSuccess(User user){
        user.setCredits(user.getCredits() + 1); // 积分+1
        // 记录登入日志
        LoginLog loginLog = new LoginLog();
        loginLog.setUserId(user.getUserId());
        loginLog.setLoginDate(new Date());
        loginLog.setIp(user.getLastIp());
        loginLogDao.insertLoginLog(loginLog);
        userDao.updateLoginInfo(user);

    }

}
