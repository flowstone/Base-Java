package org.xueyao.dbutils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.xueyao.util.JdbcUtils;

/**
 * @author Yao Xue
 * @date Aug 17, 2017 1:43:11 PM
 */
public class JDBCTest01 {
   public List<User> getAllUser() throws Exception {
       List<User> users = new ArrayList<User>();
       
       Connection con = JdbcUtils.getConnection();
       Statement statement = con.createStatement();
       String sql = "SELECT * FROM user";
       ResultSet resultSet = statement.executeQuery(sql);
       
       //将结果集遍历封装到集合中
       while (resultSet.next()) {
           String id = resultSet.getString("id");
           String username = resultSet.getString("username");
           int age = resultSet.getInt("age");
           String password = resultSet.getString("password");
           User user = new User();
           user.setAge(age);
           user.setId(id);
           user.setPassword(password);
           user.setUsername(username);
           users.add(user);
       }
       //释放资源
       JdbcUtils.release(con, statement, resultSet);
       
       return users;
   }
    
}
