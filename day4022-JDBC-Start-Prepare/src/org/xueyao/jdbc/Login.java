package org.xueyao.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.xueyao.jdbc.utils.best.JdbcUtils;

/**
 * @author Yao Xue
 * @date Aug 15, 2017 8:53:48 PM
 */
public class Login {

    public static void main(String[] args) {
        String username = "admin' -- ";
        //String username = "admin";
        String password = "123456";
        
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            //获取连接
            con = JdbcUtils.getConnection();
            //创建Statement对象
            statement = con.createStatement();
            String sql = "SELECT count(*) FROM user WHERE username='"+username+"' AND password='"+password+"'";
            System.out.println(sql);
            resultSet = statement.executeQuery(sql);
            int count = 0;
            while (resultSet.next()) {
                count = resultSet.getInt(1);
            }
            if (count == 0) {
                System.out.println("用户登录失败");
            } else {
                System.out.println("用户登录成功");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            JdbcUtils.release(con, statement, resultSet);
        }
        
    }
}
