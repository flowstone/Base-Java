package org.xueyao.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.xueyao.dao.ProductDao;
import org.xueyao.utils.JdbcUtils;
import org.xueyao.utils.Product;

/**
 * @author Yao Xue
 * @date Aug 19, 2017 11:15:41 AM
 */
public class ProductService {
    
    /**
     *  查询所有的商品的业务逻辑
     * @return
     */
    public List<Product> findAllProduct() {
        List<Product> proList = null;
        //直接调用dao层的findAllProduct
        ProductDao productDao = new ProductDao();
        
        try {
            proList = productDao.findAllProduct();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return proList;
    }
    
    public Product findProductById(int pid) {
        Product product = null;
        //直接调用dao层的findProductById这个方法就行
        ProductDao productDao = new ProductDao();
        
        try {
            product = productDao.findProductById(pid);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return product;
    }
    
    public void save(Product product) {
        //直接调用dao层save方法完成保存商品的业务逻辑
        ProductDao productDao = new ProductDao();
        try {
            productDao.save(product);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public boolean update(Product product) {
        boolean flag = false;
        ProductDao productDao = new ProductDao();
        try {
            productDao.update(product);
            flag = true;
        } catch (SQLException e) {
            
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
        return flag;
    }
    
    public void deleteById(int pid) {
        ProductDao productDao = new ProductDao();
        try {
            productDao.deleteById(pid);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public boolean deleteAll(List<Integer> pidList) {
        boolean flag = false;
        ProductDao productDao = new ProductDao();
        Connection connection = JdbcUtils.getConnection();
        System.out.println("service层的connection对象"+connection);
        
        try {
            connection.setAutoCommit(false);
            for (Integer pid : pidList) {
                productDao.deleteByIdForTransaction(pid);
            }
            
            //提交事务
            DbUtils.commitAndClose(connection);
            //将threadlocal中的connection对象移出
            //JdbcUtils.removeThreadLocalConnection();
            //事务提交成功，表示删除成功
            flag = true;
        } catch (SQLException e) {
            //事务的回滚
            try {
                DbUtils.rollbackAndClose(connection);
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
       
        return flag;
    }
}
