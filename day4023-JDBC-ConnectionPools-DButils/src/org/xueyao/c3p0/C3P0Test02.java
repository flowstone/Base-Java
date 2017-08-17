package org.xueyao.c3p0;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.xueyao.util.JdbcUtils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * C3P0配置文件方式
 * @author Yao Xue
 * @date Aug 17, 2017 1:08:48 PM
 */
public class C3P0Test02 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
       //获取连接
        try {
            //首先创建c3p0o数据库连接池对象,  传入项目的名字
            ComboPooledDataSource basicDataSource = new ComboPooledDataSource("day4023-JDBC-ConnectionPools-DButils");
            connection = basicDataSource.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM dept");
            
            while (resultSet.next()) {
                System.out.println(resultSet.getString(2));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            JdbcUtils.release(connection, statement, resultSet);
        }
        
    }
}
