package com.jt.employee_mis.serviceImpl;

import com.jt.employee_mis.entity.UserInfoEntity;
import com.jt.employee_mis.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: Jiangtian
 * @Date: 2019/6/3 16:26
 * @Description:
 */
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoService userInfoService;

    @Override
    public UserInfoEntity queryUserInfoByUsername(String username) {
        try{
            return userInfoService.queryUserInfoByUsername(username);
        } catch (Exception e) {
            return new UserInfoEntity();
        }
    }

    @Override
    public UserInfoEntity queryUserInfoByUserId(Long userId) {
        try{
            return userInfoService.queryUserInfoByUserId(userId);
        } catch (Exception e) {
            return new UserInfoEntity();
        }
    }

    @Override
    public Integer deleteUserById(Long userId) {
        try{
            return userInfoService.deleteUserById(userId);
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public Integer addUserInfo(UserInfoEntity user) {
        try{
            return userInfoService.addUserInfo(user);
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public Integer resetUserPwd(Long userId, String pwd) {
        try{
            return userInfoService.resetUserPwd(userId,pwd);
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public Integer checkUsernameUnique(String username) {
        try{
            return userInfoService.checkUsernameUnique(username);
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public Integer updateUserInfo(UserInfoEntity user) {
        try{
            return userInfoService.updateUserInfo(user);
        } catch (Exception e) {
            return 0;
        }
    }
}
