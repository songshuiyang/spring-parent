package com.mybatis.dao;


import com.mybatis.demain.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {
    List<Role> queryAll();
}
