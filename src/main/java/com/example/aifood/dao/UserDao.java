package com.example.aifood.dao;

import com.example.aifood.entity.User;

public interface UserDao {
    User findByUsernameAndPassword(String username, String password); // 登录
    boolean addUser(User user); // 注册
}
