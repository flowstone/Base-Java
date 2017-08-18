package org.xueyao.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @author Yao Xue
 * @date Aug 18, 2017 11:22:16 AM
 */
public class JdbcUtils {
    //创建一个数据库连接池
    private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
    
    public static DataSource getDataSource() {
        return dataSource;
    }
    
    //连接的获取从数据库连接池获取
    public static Connection getConnection() {
        Connection con = null;
        
        try {
            con = dataSource.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;
    }
    
    //释放资源
    public static void release(Connection con, ResultSet resultSet, Statement statement) {
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
