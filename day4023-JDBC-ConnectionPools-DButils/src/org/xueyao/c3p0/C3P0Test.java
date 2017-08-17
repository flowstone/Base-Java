package org.xueyao.c3p0;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.xueyao.util.JdbcUtils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 手动设置参数
 * @author Yao Xue
 * @date Aug 17, 2017 12:59:07 PM
 */
public class C3P0Test {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        //获取连接
        try {
            //首先创建c3p0数据库连接池对象 
            ComboPooledDataSource basicDataSource = new ComboPooledDataSource();
            //手动设置参数
            basicDataSource.setDriverClass("com.mysql.jdbc.Driver");
            basicDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/itcast");
            basicDataSource.setUser("root");
            basicDataSource.setPassword("123");
            
            connection = basicDataSource.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM user");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("username"));
            }
        } catch (PropertyVetoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            JdbcUtils.release(connection, statement, resultSet);
        }
        
    }
}
