package com.jt.employee_mis.dao;

import com.jt.employee_mis.entity.UserInfoEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface UserInfoDao
{
    /**
     * 查询用户信息
     */
    UserInfoEntity queryUserInfoByUsername(@Param("username") String username);
    /**
     * 查询用户信息
     */
    UserInfoEntity queryUserInfoByUserId(@Param("userId") Long userId);
    /**
     * 删除用户
     */
    Integer deleteUserById(@Param("userId") Long userId);
    /**
     * 新增用户
     */
    Integer addUserInfo(UserInfoEntity user);
    /**
     * 重置密码
     */
    Integer resetUserPwd(@Param("userId") Long userId, @Param("pwd") String pwd);
    /**
     * 检测用户名
     */
    Integer checkUsernameUnique(String username);
    /**
     * 更新用户
     */
    Integer updateUserInfo(UserInfoEntity user);

}
