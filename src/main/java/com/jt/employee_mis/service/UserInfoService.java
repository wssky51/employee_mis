package com.jt.employee_mis.service;

import com.jt.employee_mis.entity.UserInfoEntity;

/**
 * @Auther: Jiangtian
 * @Date: 2019/6/3 16:25
 * @Description:
 */
public interface UserInfoService {
    /**
     * 查询用户信息
     */
    UserInfoEntity queryUserInfoByUsername(String username);
    /**
     * 查询用户信息
     */
    UserInfoEntity queryUserInfoByUserId(Long userId);
    /**
     * 删除用户
     */
    Integer deleteUserById(Long userId);
    /**
     * 新增用户
     */
    Integer addUserInfo(UserInfoEntity user);
    /**
     * 重置密码
     */
    Integer resetUserPwd(Long userId,String pwd);
    /**
     * 检测用户名
     */
    Integer checkUsernameUnique(String username);
    /**
     * 更新用户
     */
    Integer updateUserInfo(UserInfoEntity user);
}
