package org.xueyao.jdbc.task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 1.确保数据库中有2条以上的记录，查询所有的学员信息，输出到控制台
 * @author Yao Xue
 * @date Aug 16, 2017 9:15:21 AM
 */
public class Task04 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/itcast";
        String username = "root";
        String password = "xueyao123456";
        
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            statement = con.createStatement();
            String sql = "SELECT id, name, gender FROM student";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                //System.out.println("id:"+resultSet.getString("id")+",姓名:"+resultSet.getString("name")+",性别:"+resultSet.getString("gender"));
                System.out.println("id:"+resultSet.getString(1)+",姓名:"+resultSet.getString(2)+",性别:"+resultSet.getString(3));
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
