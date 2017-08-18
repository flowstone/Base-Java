package org.xueyao.service;

import java.sql.SQLException;

import org.xueyao.dao.AccountDao;

/**
 * @author Yao Xue
 * @date Aug 18, 2017 2:00:05 PM
 */
public class AccountService {
    /**
     * 注意:我们需要保证service层的connection对象和dao层connection对象是同一个
     * dao层不能关闭connection对象,connection对象的关闭放在service层
     * @param outUser
     * @param inUser
     * @param money
     */
    public void transfer(String outUser, String inUser, int money) {
        AccountDao accountDao = new AccountDao();
        
        
        try {
            //付款
            accountDao.outMoney(outUser, money);
            //收款
            accountDao.inMoney(inUser, money);
            //提交事务
            //con.commit();
            System.out.println("转账成功");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("转账失败");
            e.printStackTrace();
        }
        
    }
}
