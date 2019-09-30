package com.java8.demo.utils;

import com.java8.demo.annotation.UserCase;

import java.util.List;

/**
 * @Author: tyk
 * @Date: 2019/9/30 15:28
 * @Description:
 */
public class PasswordUtils {
    @UserCase(id = 47, description = "密码中至少包含一个数字")
    public boolean validatePassword(String password) {
        return (password.matches("\\W*\\d\\w*"));
    }

    @UserCase(id = 48)
    public String encrptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }

    @UserCase(id = 49, description = "新密码不能与先前使用的密码一样")
    public boolean checkNewPassword(List<String> prev, String newPassword) {
        return !prev.contains(newPassword);
    }
}
