package com.jt.employee_mis.controller;

import com.jt.employee_mis.entity.UserInfoEntity;
import com.jt.employee_mis.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: Jiangtian
 * @Date: 2019/6/3 16:29
 * @Description:
 */
@Component
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/login")
    public String login(UserInfoEntity userInfoEntity,Model model){
        try {
            UserInfoEntity userInfo = userInfoService.queryUserInfoByUsername(userInfoEntity.getUsername());
            if(userInfo!=null && userInfo.getPassword().equals(userInfoEntity.getPassword())){
                model.addAttribute("msg","登陆成功！");
                return "login";
            }else {
                model.addAttribute("msg","登陆失败！");
                return "login";
            }
        }catch (Exception ex){
            model.addAttribute("msg","登陆失败！");
            return "login";
        }
    }
}
