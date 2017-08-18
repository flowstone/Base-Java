package me.xueyao.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @author Yao Xue
 * @date Aug 19, 2017 12:07:17 AM
 */
public class JdbcUtilsThreadLocal {
    //创建一个c3p0数据库连接池对象
    private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
    
    //首先创建一个threadLocal
    private static ThreadLocal<Connection> local = new ThreadLocal<Connection>();
    public static Connection getConnection() {
        Connection con = null;
        //con应该从数据库连接池获取
        
            try {
                con = local.get();
                if (con == null) {
                    System.out.println("第一次获取连接,从数据库连接池获取");
                    //是service层第一次获取连接connection,应该从数据库连接池去获取
                    con = dataSource.getConnection();
                    //service层拿到之后,将它保存到threadlocal中
                    local.set(con);
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
          return con; 
    }
    
    /**
     *  释放资源
     * @param con
     * @param st
     * @param rs
     */
    public static void release(Connection con,Statement st, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        if (con != null) {
            try {
                con.close();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
