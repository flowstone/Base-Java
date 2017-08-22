package org.xueyao.util;


import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBC工具类
 * @author XueYao
 * @date 2017-08-22
 */
public class JDBCUtils {
    private static ComboPooledDataSource dataSource = new ComboPooledDataSource();

    /**
     * 获得DataSource对象
     * @return  DataSource对象
     */
    public static DataSource getDataSource() {
        return dataSource;
    }

    /**
     * 获取连接池对象
     * @return   连接对象
     */
    public static Connection getConnection() {
        Connection con = null;
        try {
            con = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    /**
     * 释放资源
     * @param con  连接对象
     * @param statement   statement对象
     * @param resultSet   结果集
     */
    public static void release(Connection con, Statement statement, ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
