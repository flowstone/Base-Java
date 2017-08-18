package me.xueyao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import me.xueyao.utils.JdbcUtils;

/**
 * @author Yao Xue
 * @date Aug 18, 2017 9:12:50 PM
 */
public class AccountDao {
    /**
     * 收款的操作
     * @param inUser  收款人
     * @param money    收款金额
     * @throws SQLException
     */
    public void inMoney(String inUser, double money) throws SQLException {
        //获取连接
        Connection con = JdbcUtils.getConnection();
        String sql = "UPDATE account SET money = money + ? WHERE name = ?";
        //预编译
        PreparedStatement statement = con.prepareStatement(sql);
        //设置参数
        statement.setDouble(1, money);
        statement.setString(2, inUser);
        
        //执行sql语句
        statement.executeUpdate();
        //释放资源
        JdbcUtils.release(con, statement, null);
        
    }
    
    /**
     * 付款的操作
     * @param outUser  付款人姓名
     * @param money    付款金额
     * @throws SQLException
     */
    public void outMoney(String outUser, double money) throws SQLException {
        //获取连接
        Connection con = JdbcUtils.getConnection();
        String sql = "UPDATE account Set money = money - ? WHERE name = ?";
        //预编译
        PreparedStatement statement = con.prepareStatement(sql);
        //设置参数
        statement.setDouble(1, money);
        statement.setString(2, outUser);
        
        //执行sql语句
        statement.executeUpdate();
        //释放资源
        JdbcUtils.release(con, statement, null);
        
        
    }
}
