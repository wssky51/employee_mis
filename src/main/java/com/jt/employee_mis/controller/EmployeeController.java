package com.jt.employee_mis.controller;

import com.jt.employee_mis.entity.EmployeeEntity;
import com.jt.employee_mis.service.EmployeeService;
import com.jt.employee_mis.utils.CODE;
import com.jt.employee_mis.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
    public String findAll(Model model){
        List<EmployeeEntity> elist = employeeService.findAll();
        model.addAttribute("emps",elist);
        return "employee";
    }

}
