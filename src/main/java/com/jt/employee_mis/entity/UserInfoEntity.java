package com.jt.employee_mis.entity;

public class UserInfoEntity
{
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 描述
     */
    private String description;
    /**
     * 账户状态
     */
    private Integer accountState;
    /**
     * 用户类型
     */
    private Integer userType;

    public Integer getUserType()
    {
        return userType;
    }

    public void setUserType(Integer userType)
    {
        this.userType = userType;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Integer getAccountState()
    {
        return accountState;
    }

    public void setAccountState(Integer accountState)
    {
        this.accountState = accountState;
    }
}
