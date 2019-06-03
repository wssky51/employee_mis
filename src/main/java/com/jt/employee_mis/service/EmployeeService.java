package com.jt.employee_mis.service;

import com.jt.employee_mis.entity.EmployeeEntity;

import java.util.List;

/**
 * @Auther: Jiangtian
 * @Date: 2019/6/3 13:32
 * @Description:
 */
public interface EmployeeService {

    List<EmployeeEntity> findByCondition(EmployeeEntity employeeEntity);

    List<EmployeeEntity> findAll();
}
