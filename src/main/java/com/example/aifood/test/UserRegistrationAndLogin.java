package com.example.aifood.test;

import com.example.aifood.dao.UserDao;
import com.example.aifood.dao.UserDaoImpl;
import com.example.aifood.entity.User;

public class UserRegistrationAndLogin {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();

        // Register a new user
        User newUser = new User(0, "test_user", "test_password", "test_user@example.com");
        if (userDao.addUser(newUser)) {
            System.out.println("Registration successful!");
        } else {
            System.out.println("Registration failed!");
        }

        // Login with the registered user
        User loggedInUser = userDao.findByUsernameAndPassword("test_user", "test_password");
        if (loggedInUser != null) {
            System.out.println("Login successful! Welcome, " + loggedInUser.getUsername());
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}