package org.xueyao.domain;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;
import org.xueyao.bean.User;
import org.xueyao.util.JDBCUtils;

import java.sql.SQLException;
import java.util.List;

/**
 * @author XueYao
 * @date 2017-08-22
 */
public class DBUtilsTest {
    public static void main(String[] args) throws SQLException {
        //query();
        //add();
    }
    @Test
    public  void testUpdate() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "UPDATE user SET username = ? WHERE id = ?";
        queryRunner.update(sql, "小明", "333");

    }
    /**
     * 添加用户信息
     * @throws SQLException
     */
    @Test
    public  void testAdd() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "INSERT INTO user VALUES(?,?,?,?)";
        queryRunner.update(sql, "333", "admin", "123456", 18);

    }

    /**
     * 查询所有User
     * @throws SQLException
     */
    @Test
    public  void testQuery() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "SELECT * FROM user";
        List<User> userList = queryRunner.query(sql, new BeanListHandler<User>(User.class));

        for (User user : userList) {
            System.out.println(user);
        }
    }
    @Test
    public  void testDelete() {
        //创建QueryRunner对象
        QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "";
    }
}
