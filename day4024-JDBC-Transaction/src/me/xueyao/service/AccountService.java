package me.xueyao.service;

import java.sql.Connection;
import java.sql.SQLException;

import me.xueyao.dao.AccountDao;
import me.xueyao.utils.JdbcUtils;

/**
 * @author Yao Xue
 * @date Aug 18, 2017 9:27:00 PM
 */
public class AccountService {
    public void transfer(String inUser, String outUser, double money) {
        AccountDao accountDao = new AccountDao();
        Connection con = JdbcUtils.getConnection();
        
        try {
            //付款
            accountDao.outMoney(outUser, money);
            //收款
            accountDao.inMoney(inUser,money);
            System.out.println("转账成功");
        } catch (SQLException e) {
            System.out.println("转账失败");
            e.printStackTrace();
            
        }
    }
}
