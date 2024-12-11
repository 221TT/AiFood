package com.example.aifood.servlet;

import com.example.aifood.utils.DBConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.sql.*;

@WebServlet("/register")
public class RegisterServlet extends javax.servlet.http.HttpServlet {

    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        // 密码可以进行加密，简化为直接保存
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, username);
                pstmt.setString(2, password); // 可以考虑使用密码加密
                pstmt.setString(3, email);

                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    // 注册成功，跳转到登录页面
                    response.sendRedirect("login.jsp");
                } else {
                    response.getWriter().write("注册失败，请重试");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().write("数据库错误，注册失败");
        }
    }
}
