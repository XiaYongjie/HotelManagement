package com.hcyq.hotel.staff.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * shop_staff_member
 * @author 
 */
public class StaffEntity {
    /**
     * 用户id

     */
    private Integer id;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 权限
     */
    private Integer roleId;

    /**
     * 密码
     */
    private String password;

    private int isDelete;
    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

}