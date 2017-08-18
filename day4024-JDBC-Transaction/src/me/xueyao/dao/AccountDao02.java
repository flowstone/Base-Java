package me.xueyao.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

/**
 * @author Yao Xue
 * @date Aug 18, 2017 9:42:50 PM
 */
public class AccountDao02 {
    
    /**
     * 收款的操作
     *      我们对service层添加事务的管理,必须保证dao层和service层的connection对象是同一个.
     *      connection可以从service层传递过来.
     * @param con 
     * @param inUser   收款人
     * @param money    收款金额
     * @throws SQLException
     */
    public void inMoney(Connection con, String inUser, double money) throws SQLException {
        //首先创建queryRunner对象,此处queryRunner不给它数据库连接池
        QueryRunner queryRunner = new QueryRunner();
        String sql = "UPDATE account SET money = money + ? WHERE name = ?";
        //执行sql语句
        queryRunner.update(con, sql, money, inUser);  
        
    }
    
    /**
     * 付款的操作
     * @param con
     * @param outUser     付款人姓名 
     * @param money   付款金额
     * @throws SQLException
     */
    public void outMoney(Connection con, String outUser, double money) throws SQLException {
        //首先创建queryRunner对象,此处queryRunner不给它数据库连接池
        QueryRunner queryRunner = new QueryRunner();
        String sql = "UPDATE account SET money = money - ? WHERE name = ?";
        //执行sql语句
        queryRunner.update(con, sql, money, outUser);
        //此处不能释放资源,因为service还需要使用connection
    }
}
