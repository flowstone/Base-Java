package org.xueyao.connection.pool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

/**
 * @author Yao Xue
 * @date Aug 16, 2017 7:31:21 PM
 */
public class Test {
    public static void main(String[] args) throws SQLException {
        //首先创建自定义数据库连接池
        DataSource dataSource  = new MyDataSource();
        //获取连接
        Connection connection = dataSource.getConnection();
        //创建preparedstatement对象,执行sql语句
        PreparedStatement prepareStatement = connection.prepareStatement("INSERT INTO user VALUES(?,?,?,?)");
        prepareStatement.setString(1,"120");
        prepareStatement.setString(2,"uuu");
        prepareStatement.setInt(3, 22);
        prepareStatement.setString(4, "123");
        
        int executeUpdate = prepareStatement.executeUpdate();
        //释放资源
        prepareStatement.close();
        connection.close();
    }
}
