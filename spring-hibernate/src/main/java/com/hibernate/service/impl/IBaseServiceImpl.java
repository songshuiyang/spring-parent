package com.hibernate.service.impl;

import com.hibernate.dao.IBaseDao;
import com.hibernate.service.IBaseService;

import java.io.Serializable;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/8/26 20:23
 */
public class IBaseServiceImpl<T, PK extends Serializable> implements IBaseService<T, PK> {

    private IBaseDao<T, PK> baseDao;

    public IBaseDao<T, PK> getBaseDao() {
        return baseDao;
    }

    public void setBaseDao(IBaseDao<T, PK> baseDao) {
        this.baseDao = baseDao;
    }

    public T get(PK id) {
        return baseDao.get(id);
    }

    public PK save(T entity) {
        return baseDao.save(entity);
    }

}
