package org.xueyao.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @author Yao Xue
 * @date Aug 15, 2017 8:15:43 PM
 */
public class JdbcUtils2 {
   /* 使用C3P0数据库连接池对象
    private static String driverClass = "";
    private static String url = "";
    private static String username = "";
    private static String password = "";
    
    static {
        try {
            //创建一个properties对象
            Properties properties = new Properties();
            //将properties文件加载到内存
            properties.load(new FileInputStream("src/org/xueyao/util/jdbc.properties"));
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

    }*/
    
    //创建一个c3p0数据库连接池对象
    private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
    
    public static DataSource getDataSource() {
        return dataSource;
    }
    /**
     * 获得连接对象
     * @return  连接对象
     */
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
