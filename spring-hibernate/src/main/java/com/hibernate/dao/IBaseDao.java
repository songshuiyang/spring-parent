package com.hibernate.dao;

import java.io.Serializable;

/**
 * @author songshuiyang
 * @title: Dao接口 - Dao基接口
 * @description:
 * @date 2017/8/26 20:24
 */
public interface IBaseDao<T, PK extends Serializable> {
    /**
     * 根据ID获取实体对象.
     *
     * @param id 记录ID
     * @return 实体对象
     */
    public T get(PK id);

    /**
     * 保存实体对象.
     *
     * @param entity 对象
     * @return ID
     */
    public PK save(T entity);

}
