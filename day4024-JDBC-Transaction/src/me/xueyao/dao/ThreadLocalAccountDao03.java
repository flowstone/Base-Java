package me.xueyao.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import me.xueyao.utils.JdbcUtilsThreadLocal;

/**
 * @author Yao Xue
 * @date Aug 19, 2017 12:04:15 AM
 */
public class ThreadLocalAccountDao03 {
    /**
     *  收款的操作
     * @param inUser  收款人
     * @param money   收款金额
     * @throws SQLException
     */
    public void inMoney(String inUser, double money) throws SQLException {
        System.out.println(Thread.currentThread()+"======");
        Connection con = JdbcUtilsThreadLocal.getConnection();
        System.out.println(con);
        //首先创建queryRunner对象,此处queryRunner不给它数据库连接池
        QueryRunner queryRunner = new QueryRunner();
        String sql = "UPDATE account SET money = money + ? WHERE name = ?";
        //执行sql语句
        queryRunner.update(con, sql, money, inUser);
        
    }
    
    /**
     * 付款的操作
     * @param outUser  付款人姓名
     * @param money    付款金额
     * @throws SQLException
     */
    public void outMoney(String outUser, double money) throws SQLException {
        System.out.println(Thread.currentThread()+"=====");
        Connection con = JdbcUtilsThreadLocal.getConnection();
        System.out.println(con);
        //首先创建queryRunner对象,此处queryRunner不给它数据库连接池
        QueryRunner queryRunner = new QueryRunner();
        String sql = "UPDATE account SET money = money-? WHERE name=?";
        //执行sql语句
        queryRunner.update(con, sql, money, outUser);
    }
}
