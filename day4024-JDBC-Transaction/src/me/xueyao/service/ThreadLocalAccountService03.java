package me.xueyao.service;

import java.sql.Connection;
import java.sql.SQLException;

import me.xueyao.dao.ThreadLocalAccountDao03;
import me.xueyao.utils.JdbcUtilsThreadLocal;

/**
 * @author Yao Xue
 * @date Aug 19, 2017 1:15:26 AM
 */
public class ThreadLocalAccountService03 {
    public void transfer(String inUser, String outUser, double money) {
        System.out.println(Thread.currentThread()+"====");
        ThreadLocalAccountDao03 accountDao = new ThreadLocalAccountDao03();
        Connection con = JdbcUtilsThreadLocal.getConnection();
        System.out.println(con);
        
        try {
            //开启事务
            con.setAutoCommit(false);
            //付款
            accountDao.outMoney(outUser, money);
            //模拟异常
            //int i= 1/0;
            //收款
            accountDao.inMoney(inUser, money);
            //提交事务
            con.commit();
            System.out.println("转账成功");
        } catch (SQLException e) {
            try {
                //回滚事务
                con.rollback();
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            System.out.println("转账失败");
            e.printStackTrace();
        }
    }
}
