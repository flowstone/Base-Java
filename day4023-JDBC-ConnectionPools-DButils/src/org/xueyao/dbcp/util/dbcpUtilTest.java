package org.xueyao.dbcp.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp.BasicDataSource;
import org.xueyao.util.JdbcUtils;

/**
 * 手动配置方式
 * @author Yao Xue
 * @date Aug 16, 2017 9:41:50 PM
 */
public class dbcpUtilTest {
    public static void main(String[] args) {
        //首先创建一个dbcp数据库连接池对象
        BasicDataSource basicDataSource = new BasicDataSource();
        //手动设置连接需要的参数
        
        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/itcast");
        basicDataSource.setUsername("root");
        basicDataSource.setPassword("xueyao123456");
        
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        //获取连接
        try {
            connection = basicDataSource.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM user");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("username"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            JdbcUtils.release(connection, statement, resultSet);
        }
    }
}
