package com.shiro.learn.permission;

import org.apache.shiro.authz.Permission;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/11/27 21:40
 */
public class MyPermission implements Permission {

    // 资源
    private String resourceId;
    // 操作
    private String operator;
    // 实例Id
    private String instanceiD;


    public MyPermission() {


    }

    public MyPermission(String permission) {
        String[] str = permission.split("\\*");

    }

    @Override
    public boolean implies(Permission p) {
        return false;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getInstanceiD() {
        return instanceiD;
    }

    public void setInstanceiD(String instanceiD) {
        this.instanceiD = instanceiD;
    }
}
