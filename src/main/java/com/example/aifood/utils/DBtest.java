package com.example.aifood.utils;

import java.sql.Connection;
import java.sql.SQLException;

public class DBtest {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = DBConnection.getConnection()) {
            if (conn != null && !conn.isClosed()) {
                System.out.println("数据库连接成功！");
            } else {
                System.out.println("未能建立数据库连接。");
            }
        } catch (SQLException e) {
            System.err.println("数据库连接失败：" + e.getMessage());
            e.printStackTrace();
        }
    }
}
