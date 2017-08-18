package me.xueyao.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @author Yao Xue
 * @date Aug 18, 2017 9:02:42 PM
 */
public class JdbcUtils {
    
    //创建一个c3p0数据库连接池
    private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
    
    /**
     * 获取连接对象
     * @return
     */
    public static Connection getConnection() {
        Connection con = null;
        //con应该从数据库连接池获取
        try {
            con = dataSource.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;
    }
    
    /**
     * 释放资源
     * @param con
     * @param statement
     * @param resultSet
     */
    public static void release(Connection con, Statement statement, ResultSet resultSet) {
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
