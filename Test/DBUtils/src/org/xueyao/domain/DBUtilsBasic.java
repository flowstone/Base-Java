package org.xueyao.domain;

import org.junit.Test;
import org.xueyao.bean.User;
import org.xueyao.util.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author XueYao
 * @date 2017-08-22
 */
public class DBUtilsTest {

    public static void main(String[] args) throws SQLException {
        List<User> allUser = getAllUser();
        System.out.println(allUser);
    }
    public static List<User> getAllUser() throws SQLException {
        List<User> users = new ArrayList<>();
        Connection con = JDBCUtils.getConnection();
        Statement statement = con.createStatement();
        String sql = "SELECT * FROM user";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            String id = resultSet.getString("id");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            int age = resultSet.getInt("age");
            User user = new User();
            user.setId(id);
            user.setUsername(username);
            user.setPassword(password);
            user.setAge(age);
            users.add(user);
        }
        JDBCUtils.release(con, statement, resultSet);
        //System.out.println(users);
        return users;
    }
}
