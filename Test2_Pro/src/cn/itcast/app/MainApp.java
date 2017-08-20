package cn.itcast.app;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import cn.itcast.tools.JDBCUtils;

/**
 * 
 * 使用连接池创建QueryRunner对象；
  b). 判断转出方是否有足够余额，如果不足，提示信息：”余额不足！”，并结束程序；
  c). 实现卡号：6212999999999向6212888888888转账600万的操作；
 并将转入、转出记录分别写入到Transaction表中。
     友情提醒：注意事务处理和利率的判断；  查询中，所有涉及到账户的条件，全部使用”卡号”作为查询条
 件。
 * @author Yao Xue
 * @date Aug 19, 2017 8:53:05 PM
 */
public class MainApp {
    public static void main(String[] args) {
        Connection con = JDBCUtils.getConnection();
        
        try {
            con.setAutoCommit(false);
            outMoney(con, "6212999999999", 6000000);
            inMoney(con, "6212888888888", 6000000);
            DbUtils.commitAndClose(con);
            System.out.println("转账成功");
            
        } catch (SQLException e) {
            try {
                DbUtils.rollbackAndClose(con);
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            System.out.println("转账失败");
        }
       
    }   

    public static void inMoney(Connection con, String inUser, double money) throws SQLException {
        QueryRunner queryRunner = new QueryRunner();
        String sql = "UPDATE account SET balance = balance + ? WHERE name=?";
        queryRunner.update(con, sql, money, inUser);  
        
    }
    
    public static void outMoney(Connection con, String outUser, double money) throws SQLException {
        QueryRunner queryRunner = new QueryRunner();
        String sql = "UPDATE account SET balance = balance - ? WHERE name = ?";
        queryRunner.update(con, sql, money, outUser);
    }
}
