package org.xueyao.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.xueyao.utils.JdbcUtils;
import org.xueyao.utils.Product;

/**
 * @author Yao Xue
 * @date Aug 19, 2017 10:26:40 AM
 */
public class ProductDao {
    /**
     * 查询所有商品
     * @return
     * @throws SQLException
     */
    public List<Product> findAllProduct() throws SQLException {
        List<Product> proList = new ArrayList<Product>();
        QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
        
        String sql = "SELECT * FROM product";
        proList = queryRunner.query(sql, new BeanListHandler<Product>(Product.class));
        
        return proList;
    }
    
    public Product findProductById(int pid) throws SQLException {
        Product product = null;
        //首先创建一个queryRunner对象
        QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
        //执行查询
        String sql = "SELECT * FROM product WHERE pid = ?";
        
        product = queryRunner.query(sql, new BeanHandler<Product>(Product.class),pid);
        return product;
    }
    
    public void save(Product product) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
        String sql = "INSERT INTO product VALUES(?,?,?,?,?)";
        queryRunner.update(sql, null, product.getPname(),product.getPrice(),product.getFlag(),product.getCategory_id());
        
    }
    
    public void update(Product product) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
        String sql = "UPDATE products SET pname = ?,price = ? WHERE pid=?";
        queryRunner.update(sql, product.getPname(),product.getPrice(),product.getPid());
        
    }
    
    public void deleteById(int pid) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
        String sql = "DELETE FROM product WHERE pid = ?";
        queryRunner.update(sql, pid);
    }
    
    public void deleteByIdForTransaction(int pid) throws SQLException {
        Connection con = JdbcUtils.getConnection();
        System.out.println("dao层的connection对象"+con);
        QueryRunner queryRunner = new QueryRunner();
        String sql = "DELETE FROM product WHERE pid = ?";
        queryRunner.update(con,sql, pid);
    }
}
