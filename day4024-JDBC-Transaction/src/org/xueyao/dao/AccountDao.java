package org.xueyao.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.xueyao.utils.JdbcUtils;

/**
 * @author Yao Xue
 * @date Aug 18, 2017 11:32:36 AM
 */
public class AccountDao {
    /**
     * 在开发中,dao层的异常一般都抛,service层
     * 付款的方法
     * @param outUser 付款人的姓名
     * @param money  付款金额
     * @throws SQLException
     */
    public void outMoney(String outUser, int money) throws SQLException {
        //首先创建QueryRunner对象
        QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
        //执行sql语句
        
        String sql = "UPDATE account SET money = money-? WHERE name=?";
        queryRunner.update(sql, money, outUser);
    }
    
    /**
     * 收款的操作
     * @param inUser 收款人
     * @param money  收款金额
     * @throws SQLException
     */
    public void inMoney(String inUser, int money) throws SQLException {
        //创建QueryRunner对象
        QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
        //执行sql语句
        String sql = "UPDATE account SET money = money + ? WHERE name = ?";
        queryRunner.update(sql, money, inUser);
    }
}
