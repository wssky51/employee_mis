package com.jt.employee_mis.controller;

import com.jt.employee_mis.service.EmployeeService;
import com.jt.employee_mis.utils.CODE;
import com.jt.employee_mis.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: Jiangtian
 * @Date: 2019/6/3 13:32
 * @Description:
 */
@Component
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/findAll")
    @ResponseBody
    public Result findAll(){
        try{
            return new Result(CODE.OK,employeeService.findAll(),"查询成功！");
        } catch (Exception e) {
            return new Result(CODE.ERROR,null,"查询失败！");
        }
    }

}
