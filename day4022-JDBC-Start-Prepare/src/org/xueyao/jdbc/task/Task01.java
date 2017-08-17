package org.xueyao.jdbc.task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 通过代码获得Statement对象并执行一条创表语句：创建一张学生表(id，姓名，性别) 
 * @author Yao Xue
 * @date Aug 15, 2017 9:46:46 PM
 */
public class Task01 {
    public static void main(String[] args) {
        Connection con = null;
        Statement statement = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itcast", "root", "xueyao123456");
            statement = con.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS student("
                    + " id INT AUTO_INCREMENT COMMENT '学生id',"
                    + " name VARCHAR(20) NOT NULL DEFAULT '' COMMENT '姓名',"
                    + " gender CHAR COMMENT '性别',"
                    + " PRIMARY KEY (id)"
                    + ")CHARACTER SET utf8 COMMENT '学生表'";
            //executeUpdate对于DDL不返回任何内容
            statement.executeUpdate(sql);
            
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
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
}
