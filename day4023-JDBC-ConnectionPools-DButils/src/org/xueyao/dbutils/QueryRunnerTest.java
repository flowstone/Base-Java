package org.xueyao.dbutils;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;
import org.xueyao.util.JdbcUtils2;

/**
 * @author Yao Xue
 * @date Aug 17, 2017 2:36:22 PM
 */
public class QueryRunnerTest {
    /**
     * BeanHandler(重点): 结果集处理的一种方式
     *      使用格式: new BeanHandler<泛型>(类型)
     *      将第一条数据封装到一个javaBean中
     * @throws SQLException
     */
    @Test
    public void beanHandlerTest() throws SQLException {
        QueryRunner queryRunner =  new QueryRunner(JdbcUtils2.getDataSource());
        
        String sql = "SELECT * FROM product";
        //调用query
        Product query = queryRunner.query(sql,new BeanHandler<Product>(Product.class));
        System.out.println(query);
    }
    /**
     * beanListHandler(重点):
     *      使用格式: new BeanListHandler<泛型>(类型)
     *      将所有数据封装到javabean的集合中
     * @throws SQLException
     */
    @Test
    public void beanListHandlerTest() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JdbcUtils2.getDataSource());
        
        String sql = "SELECT * FROM product";
        //调用query
        List<Product> list = queryRunner.query(sql, new BeanListHandler<Product>(Product.class));
        
        for (Product product : list) {
            System.out.println(product);
        }
    }
    /**
     * ScalarHandler(重点):
     *      将一个值的数据进行封装.
     *      一般用于聚合函数.count(*)是常用 的,返回值必须是Long
     * @throws SQLException
     */
    @Test
    public void ScalarHandlerTest() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JdbcUtils2.getDataSource());
        String sql = "SELECT COUNT(*) FROM product";
        Long query = queryRunner.query(sql,new ScalarHandler<Long>());
        System.out.println(query);
    }
}
