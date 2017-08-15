package org.xueyao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.xueyao.jdbc.utils.best.JdbcUtils;


/**
 * @author Yao Xue
 * @date Aug 15, 2017 8:53:48 PM
 */
public class Login2 {

    public static void main(String[] args) {
        //String username = "admin' -- ";
        String username = "admin";
        String password = "123456";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            //获取连接
            con = JdbcUtils.getConnection();
            //书写sql语句,用户输入的值先用?占位
            String sql = "SELECT count(*) FROM user WHERE username=? AND password=?";
            //将sql语句进行编译
            statement = con.prepareStatement(sql);
            //向编译好的sql语句中填充参数
            statement.setString(1, username);
            statement.setString(2, password);
            //将编译好的sql语句发送给数据库执行.此处不需要参数
            resultSet = statement.executeQuery();
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
            //释放资源
            JdbcUtils.release(con, statement, resultSet);
        }
        
    }
}
