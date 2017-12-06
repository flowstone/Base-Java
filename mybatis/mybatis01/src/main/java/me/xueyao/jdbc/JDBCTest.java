package me.xueyao.jdbc;

import java.sql.*;

/**
 * @author XueYao
 * @date 2017-12-06
 */
public class JDBCTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
       try{
           //加载驱动
           Class.forName("com.mysql.jdbc.Driver");

           String url = "jdbc:mysql://127.0.0.1:3306/mybatis";
           String user = "root";
           String password = "xueyao123456";
           //获取连接
           connection = DriverManager.getConnection(url, user, password);
           String sql = "SELECT * FROM tb_user";
           //获取preparedStatement对象
           preparedStatement = connection.prepareStatement(sql);
           //执行查询,并返回结果集
           resultSet = preparedStatement.executeQuery();
           //遍历结果集
           while (resultSet.next()) {
               System.out.println(resultSet.getString("user_name"));
               System.out.println(resultSet.getString("name"));
               System.out.println(resultSet.getInt("age"));

           }
       }finally {
           //释放资源
           if (resultSet != null) {
               resultSet.close();
           }
           if (preparedStatement != null) {
               preparedStatement.close();
           }
           if (connection != null) {
               connection.close();
           }

       }


    }
}
