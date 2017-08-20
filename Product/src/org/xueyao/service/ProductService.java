package org.xueyao.service;

import org.xueyao.dao.ProductDao;
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
public class ProductService {
    /**
     * 查询所有商品的service方法
     * @return 所有商品的集合
     */
    public List<Product> findAll() {
        List<Product> proList = new ArrayList<Product>();
        ProductDao productDao = new ProductDao();
        try {
            proList = productDao.findAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return proList;
    }

    /**
     * 通过id查询商品信息的service方法
     * @param pid  商品id
     * @return 商品对象
     */
    public Product findProductById(int pid) {
        Product product = null;
        //直接调用dao层的方法完成查询的操作
        ProductDao productDao = new ProductDao();
        try {
            product  = productDao.findProductById(pid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;

    }

    /**
     * 添加商品信息
     * @param product 商品对象
     * @return  返回是否成功标记
     */
    public boolean save(Product product) {
        //默认失败
        boolean flag = false;
        ProductDao productDao = new ProductDao();
        try {
            productDao.save(product);
            //在dao方法成功执行之后，表示添加成功，所以标记成功
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 根据商品Id修改商品信息
     * @param product  商品对象
     * @return  是否修改成功
     */
    public boolean update(Product product) {
        //默认失败
        boolean flag = false;
        ProductDao productDao = new ProductDao();
        try {
            productDao.update(product);
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 根据id删除商品的信息
     * @param pid  商品的id
     * @return  是否删除成功
     */
    public boolean deleteById(int pid) {
        boolean flag = false;
        ProductDao productDao = new ProductDao();
        try {
            productDao.deleteById(pid);
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 此处删除涉及多条sql语句，它们必须是一个整体，所以我们对此必须添加事务的控制
     * @param pids  存放商品id的集合
     * @return 返回是否删除成功
     */
    public boolean deleteAll(List<Integer> pids) {
        boolean flag = false;
        ProductDao productDao = new ProductDao();
        //获取连接
        Connection con = JdbcUtils.getConnection();
        System.out.println(con);
        try {
            //开启事务
            con.setAutoCommit(false);
            for (Integer pid : pids) {
               productDao.deleteByIdThreadLocal(pid);
            }
            //提交事务
            con.commit();
            flag = true;
        } catch (SQLException e) {
            try {
                //回滚事务
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            JdbcUtils.release(con, null, null);
            //清空threadLocal中的connection对象
            JdbcUtils.releadThreadLocal();
        }
        return flag;
    }
}
