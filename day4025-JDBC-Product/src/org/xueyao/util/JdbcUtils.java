package org.xueyao.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author XueYao
 * 2017-08-19
 */
public class JdbcUtils {
    //创建一个c3p0数据库连接池对象
    private static ComboPooledDataSource dataSource = new ComboPooledDataSource();

    private static ThreadLocal<Connection> local = new ThreadLocal<Connection>();
    /**
     * 获取DataSource对象
     * @return   DataSource对象
     */
    public static DataSource getDataSource() {
        return dataSource;
    }

    public static void releadThreadLocal() {
        //移出当前线程保存的connection对象
        local.remove();
    }
    /**
     * 从c3p0的数据库连接池中获取连接
     * @return  连接对象
     */
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * 释放资源
     * @param connection   连接对象
     * @param statement    Statement对象
     * @param resultSet    结果集
     */
    public static void release(Connection connection, Statement statement, ResultSet resultSet) {
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
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
