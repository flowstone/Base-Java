package org.xueyao.dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.xueyao.util.JdbcUtils;
import org.xueyao.util.Product;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author XueYao
 * @date 2017-08-20
 */
public class ProductDao {
    /**
     * 查询所有商品信息
     * @return 返回商品list集合
     * @throws SQLException
     */
    public List<Product> findAll() throws SQLException {
        List<Product> proList = new ArrayList<Product>();
        QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
        String sql = "SELECT * FROM product WHERE status = 1";
        //此处选用BeanListHandler结果集的处理，将所有结果放在list集合中
        proList = queryRunner.query(sql, new BeanListHandler<Product>(Product.class));
        return proList;

    }

    /**
     * 通过商品的id 值获取商品的信息
     * @param pid   int    商品的id
     * @return 单个JavaBean
     * @throws SQLException
     */
    public Product findProductById(int pid) throws SQLException {
        Product product = null;
        QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
        String sql = "SELECT * FROM product WHERE pid = ?";
        //使用BeanHandler结果，将结果封装给单个的javabean
        product  = queryRunner.query(sql, new BeanHandler<Product>(Product.class) , pid);
        return product;
    }

    /**
     * 添加商品信息
     * @param product  商品对象
     * @throws SQLException
     */
    public void save(Product product) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
        String sql = "INSERT INTO product VALUES(?, ?, ?, ?, ?)";
        queryRunner.update(sql, null, product.getPname(), product.getPrice(), "c001", 1);
    }

    /**
     * 根据id修改商品的信息
     * @param product   商品对象
     * @throws SQLException
     */
    public void update(Product product) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
        String sql = "UPDATE product SET pname = ?, price = ? WHERE pid = ?";
        queryRunner.update(sql, product.getPname(), product.getPrice(), product.getPid());
    }

    /**
     * 实际开发中，对于数据并不是真正意义上的删除操作，只是将数据状态修改一下，方便后期数据的维护，数据的追踪
     * @param pid  要删除商品Id
     * @throws SQLException
     */
    public void deleteById(int pid) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
        //String sql = "DELETE FROM product WHERE pid = ?";
        String sql = "UPDATE product SET status = 0 WHERE pid = ?";
        queryRunner.update(sql, pid);
    }

    /**
     * 调用这个方法的service层提供了事务的管控，必须保证dao层的connection对象和service是同一个
     * @param pid  商品的id
     */
    public void deleteByIdThreadLocal(int pid) throws SQLException {
        //我们需要手动的从threadlocal中获取连接对象
        Connection con  = JdbcUtils.getConnection();
        System.out.println(con);
        QueryRunner queryRunner = new QueryRunner();
        //String sql = "DELETE FROM product WHERE pid = ?";
        String sql = "UPDATE product SET status = 0 WHERE pid = ?";
        queryRunner.update(con, sql, pid);
    }

}
