package com.jt.employee_mis.serviceImpl;

import com.jt.employee_mis.dao.UserInfoDao;
import com.jt.employee_mis.entity.UserInfoEntity;
import com.jt.employee_mis.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: Jiangtian
 * @Date: 2019/6/3 16:26
 * @Description:
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoDao UserInfoDao;

    @Override
    public UserInfoEntity queryUserInfoByUsername(String username) {
        try{
            return UserInfoDao.queryUserInfoByUsername(username);
        } catch (Exception e) {
            return new UserInfoEntity();
        }
    }

    @Override
    public UserInfoEntity queryUserInfoByUserId(Long userId) {
        try{
            return UserInfoDao.queryUserInfoByUserId(userId);
        } catch (Exception e) {
            return new UserInfoEntity();
        }
    }

    @Override
    public Integer deleteUserById(Long userId) {
        try{
            return UserInfoDao.deleteUserById(userId);
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public Integer addUserInfo(UserInfoEntity user) {
        try{
            return UserInfoDao.addUserInfo(user);
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public Integer resetUserPwd(Long userId, String pwd) {
        try{
            return UserInfoDao.resetUserPwd(userId,pwd);
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public Integer checkUsernameUnique(String username) {
        try{
            return UserInfoDao.checkUsernameUnique(username);
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public Integer updateUserInfo(UserInfoEntity user) {
        try{
            return UserInfoDao.updateUserInfo(user);
        } catch (Exception e) {
            return 0;
        }
    }
}
