package org.xueyao.dbcp.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.xueyao.util.JdbcUtils;

/**
 * DBCP配置文件的方式 
 * @author Yao Xue
 * @date Aug 17, 2017 12:41:54 PM
 */
public class dbcpUtilTest02 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        Properties properties = new Properties();
        try {
            //加载配置文件到内存中
            properties.load(new FileInputStream("src/org/xueyao/dbcp/util/dbcp.properties"));
            //创建dbcp数据库连接池
            DataSource basicDataSource = BasicDataSourceFactory.createDataSource(properties);
            //创建连接
            connection = basicDataSource.getConnection();
            //创建Statement对象
            statement = connection.createStatement();
            //执行sql语句
            resultSet = statement.executeQuery("SELECT * FROM user");
            
            while (resultSet.next()) {
                System.out.println(resultSet.getString("username"));
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            JdbcUtils.release(connection, statement, resultSet);
        }
        
    }
}
