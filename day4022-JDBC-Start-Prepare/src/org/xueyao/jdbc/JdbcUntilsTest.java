package org.xueyao.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.xueyao.jdbc.utils.JdbcUtils;

/**
 * @author Yao Xue
 * @date Aug 15, 2017 7:46:44 PM
 */
public class JdbcUntilsTest {
    
    public static void main(String[] args) {
        //获取工具类中,连接的对象
        Connection con = JdbcUtils.getConnection();
        
        Statement statement = null;
        ResultSet resultSet = null;
        
        try {
            //得到Statement对象
            statement = con.createStatement();
            //sql语句
            String sql = "SELECT * FROM user";
            //执行查询操作,返回结果集
            resultSet = statement.executeQuery(sql);
            //遍历输出
            while (resultSet.next()) {
                System.out.println(resultSet.getString("username"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            //释放资源
            JdbcUtils.release(resultSet, statement, con);
        }
    }
}
