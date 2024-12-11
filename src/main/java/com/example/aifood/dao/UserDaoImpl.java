package com.example.aifood.dao;

import com.example.aifood.entity.User;

import java.sql.ResultSet;

public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User findByUsernameAndPassword(String username, String password) {
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        try (ResultSet resultSet = executeQuery(sql, username, password)) {
            if (resultSet.next()) {
                return new User(
                        resultSet.getInt("id"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("email")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean addUser(User user) {
        String sql = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
        try {
            int rows = executeUpdate(sql, user.getUsername(), user.getPassword(), user.getEmail());
            return rows > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}