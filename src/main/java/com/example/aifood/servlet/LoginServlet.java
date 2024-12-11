package com.example.aifood.servlet;

import com.example.aifood.utils.DBConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.sql.*;

@WebServlet("/login")
public class LoginServlet extends javax.servlet.http.HttpServlet {

    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, username);
                pstmt.setString(2, password);  // 这里可以加入密码加密验证

                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {
                    // 登录成功，跳转到首页或用户主页
                    response.sendRedirect("index.jsp");
                } else {
                    response.getWriter().write("用户名或密码错误");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().write("数据库错误，登录失败");
        }
    }
}
