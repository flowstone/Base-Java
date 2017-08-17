package org.xueyao.jdbc.task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *  JDBC 预处理对象--增删改查
 *  使用PreparedStatement对象完成数据库的增删改查

 * @author Yao Xue
 * @date Aug 16, 2017 10:00:14 AM
 */
public class Task05 {
    public static void main(String[] args) {
        addStudent();
    }

    private static void addStudent() {
        //1.添加一个学生到学生表
        Connection con = null;
        PreparedStatement statement = null;
        con = JdbcUtil.getConnection();
        String sql = "INSERT INTO student VALUES(NULL, ?, ?)";
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, "小明");
            statement.setString(2, "男");
            int count = statement.executeUpdate();
            System.out.println("插入"+count+"条数据");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            JdbcUtil.close(con,statement);
        }
    }
    
    public static void deleteStudent() {
        Connection con = JdbcUtil.getConnection();
        PreparedStatement statement = null;
        String sql = "DELETE FROM student WHERE id = 1";
        try {
            statement = con.prepareStatement(sql);
            int count = statement.executeUpdate();
            System.out.println("删除"+count+"条数据");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            JdbcUtil.close(con,statement);
        }
        
        
    }
}
