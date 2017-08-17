package org.xueyao.jdbc.task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 1．向学生表中添加1条记录，因为主键是自动增长，所以只需指定姓名和性别字段。
 * @author Yao Xue
 * @date Aug 16, 2017 8:39:25 AM
 */
public class Task03 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement statement = null;
        String url = "jdbc:mysql://localhost:3306/itcast";
        String username = "root";
        String password = "xueyao123456";
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获得连接
            con = DriverManager.getConnection(url, username, password);
            //sql语句
            String sql = "UPDATE student SET name = ? WHERE id = 2";
            //预编译
            statement = con.prepareStatement(sql);
            statement.setString(1, "猪八戒");
            
            int count = statement.executeUpdate();
            System.out.println("更新"+count+"条记录");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
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
        }
    }
}
