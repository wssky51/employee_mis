package com.jt.employee_mis.dao;

import com.jt.employee_mis.entity.EmployeeEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: Jiangtian
 * @Date: 2019/6/3 13:42
 * @Description:
 */
@Repository
public interface EmployeeDao {

    List<EmployeeEntity> findByCondition(EmployeeEntity employeeEntity);

    List<EmployeeEntity> findAll();

}
