package me.xueyao.service;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;

import me.xueyao.dao.AccountDao02;
import me.xueyao.utils.JdbcUtils;

/**
 * @author Yao Xue
 * @date Aug 18, 2017 11:40:16 PM
 */
public class AccountService02 {
    public void transfer(String inUser, String outUser, double money) {
        AccountDao02 accountDao = new AccountDao02();
        Connection con = JdbcUtils.getConnection();
        
        try {
            //开启事务
            con.setAutoCommit(false);
            //付款
            accountDao.outMoney(con, outUser, money);
            //收款
            accountDao.inMoney(con, inUser, money);
            //提交事务
            //con.commit();
            //使用dbutils管理事务
            DbUtils.commitAndClose(con);
            System.out.println("转账成功");
            
        } catch (SQLException e) {
            try {
                //回滚事务
                //con.rollback();
                DbUtils.rollbackAndClose(con);
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            System.out.println("转账失败");
            e.printStackTrace();
        }
       
    }
}
