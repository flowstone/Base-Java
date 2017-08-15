package org.xueyao.jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Yao Xue
 * @date Aug 15, 2017 7:23:35 PM
 */
public class JdbcUtils {
    private static String driverClass ="com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/itcast";
    private static String username = "root";
    private static String password = "xueyao123456";
    /**
     * 获得连接
     */
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName(driverClass);
            //获取连接
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;
    }
    
    /**
     * 释放资源
     */
    public static void release(ResultSet resultSet, Statement statement, Connection con) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
}
