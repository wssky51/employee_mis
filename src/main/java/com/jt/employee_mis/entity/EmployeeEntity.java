package com.jt.employee_mis.entity;

/**
 * @Auther: Jiangtian
 * @Date: 2019/6/3 13:49
 * @Description: 雇员实体类
 */
public class EmployeeEntity {

    private Long id;

    private String name;

    private Integer age;

    private String gender;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
