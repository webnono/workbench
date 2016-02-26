package com.webnono.core.form;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 表单验证
 */
public class UserLoginForm {

    @NotEmpty(message = "请输入用户名")
    private String username;
    @NotEmpty(message = "请输入密码")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
