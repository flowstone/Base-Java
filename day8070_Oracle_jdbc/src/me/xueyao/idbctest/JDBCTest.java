package me.xueyao.idbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {

    public static void main(String[] args) throws Exception {
        //1.加载驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //2.创建连接对象
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "sys as sysdba";
        String password = "xueyao123456";
        
        Connection conn = DriverManager.getConnection(url, user, password);
        //3.获取语句对象
        
        Statement stat = conn.createStatement();
        
        //4.发送sql语句
        String sql = "select * from tt";
        ResultSet rs = stat.executeQuery(sql);
        
        //5.处理执行结果 
        while (rs.next()) {
            System.out.println(rs.getString("name"));
        }
        System.out.println("over!");
        //6.释放资源，先开后关
        rs.close();
        stat.close();
        conn.close();
    }
}
