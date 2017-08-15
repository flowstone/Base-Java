package org.xueyao.jdbc.utils.best;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author Yao Xue
 * @date Aug 15, 2017 8:15:43 PM
 */
public class JdbcUtils {
    
    private static String driverClass = "";
    private static String url = "";
    private static String username = "";
    private static String password = "";
    
    static {
        try {
            //创建一个properties对象
            Properties properties = new Properties();
            //将properties文件加载到内存
            properties.load(new FileInputStream("src/org/xueyao/jdbc/utils/best/jdbc.properties"));
            //获取properties中的参数
            driverClass = properties.getProperty("driverClass");
            url = properties.getProperty("url");
            username = properties.getProperty("username");
            password = properties.getProperty("password");
            //驱动的注册也只需要执行一次
            Class.forName(driverClass);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    /**
     * 获得连接对象
     * @return  连接对象
     */
    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;
    }
    
    /**
     * 释放资源
     * @param con   连接对象
     * @param statement  
     * @param resultSet  结果集
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
