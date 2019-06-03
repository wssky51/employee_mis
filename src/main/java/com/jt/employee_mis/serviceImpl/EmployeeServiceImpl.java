package com.jt.employee_mis.serviceImpl;

import com.jt.employee_mis.dao.EmployeeDao;
import com.jt.employee_mis.entity.EmployeeEntity;
import com.jt.employee_mis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Jiangtian
 * @Date: 2019/6/3 13:33
 * @Description:
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<EmployeeEntity> findByCondition(EmployeeEntity employeeEntity) {
        try{
            return employeeDao.findByCondition(employeeEntity);
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    @Override
    public List<EmployeeEntity> findAll() {
        try{
            return employeeDao.findAll();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
