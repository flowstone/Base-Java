package org.xueyao.dbutils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;
import org.xueyao.util.JdbcUtils2;

/**
 * @author Yao Xue
 * @date Aug 17, 2017 2:02:57 PM
 */
public class Test01 {
    public static void main(String[] args) throws SQLException {
        //创建QueryRunnber对象
        QueryRunner runner = new QueryRunner(JdbcUtils2.getDataSource());
        
        //执行sql
        String sql = "SELECT * FROM user";
        List<User> userList = runner.query(sql, new BeanListHandler<User>(User.class));
        System.out.println(userList);
    }
    @Test
    public void add() throws SQLException {
        //首先创建queryRunner对象
        QueryRunner queryRunner = new QueryRunner();
        String sql = "INSERT INTO product VALUES(?,?,?,?)";
        //执行sql语句,因为queryRunner 的使用无参构造,所以需要手动传递connection对象
        Connection con = JdbcUtils2.getConnection();
        queryRunner.update(con, sql, 14,"空调",2000,"c001");
        //connection需要手动关闭
        JdbcUtils2.release(con, null, null);
    }
    
    @Test
    public void update() throws SQLException {
        //创建queryRunner的时候传入c3p0数据库连接池对象
        QueryRunner queryRunner = new QueryRunner(JdbcUtils2.getDataSource());
        String sql = "update product set price = ?";
        //执行sql语句,因为创建queryRunner 的时候传递数据库连接池
        //所以queryRunner自己从数据库连接池取连接,用完了自己释放资源
        queryRunner.update(sql, 500);
    }
    @Test
    public void delete() {
        //创建QueryRunner对象
        QueryRunner queryRunner = new QueryRunner(JdbcUtils2.getDataSource());
        
        try {
            int update = queryRunner.update("DELETE FROM product WHERE pid=?",14);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
