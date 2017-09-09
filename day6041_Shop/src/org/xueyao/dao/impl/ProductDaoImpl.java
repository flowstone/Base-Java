package org.xueyao.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.xueyao.dao.ProductDao;
import org.xueyao.domain.Product;
import org.xueyao.utils.JDBCUtils;

public class ProductDaoImpl implements ProductDao {
	private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
	
	@Override
	public List<Product> findAll() {
		String sql = "SELECT * FROM product";
		try {
			return qr.query(sql, new BeanListHandler<Product>(Product.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("查询所有商品信息失败");
		}
	}
	
	private QueryRunner run = new QueryRunner();
	@Override
	public void release(String cid) {
		String sql = "UPDATE product SET cid=null WHERE cid=?";
		try {
			run.update(JDBCUtils.getConnection(), sql, cid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void delete(String pid) {
		String sql = "DELETE FROM product WHERE pid = ?";
		try {
			qr.update(sql, pid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("删除商品信息错误");
		}
	}
	@Override
	public Product findProductById(String pid) {
		String sql = "SELECT * FROM product WHERE pid = ?";
		
		try {
			return qr.query(sql, new BeanHandler<Product>(Product.class), pid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("查询该商品信息错误");
		}
	}
	@Override
	public void update(Product product) {
		String sql = "UPDATE product SET pname=?, market_price=?, shop_price=?, is_hot=?, pdesc=?, cid=? WHERE pid=?";
		List<Object> list = new ArrayList<>();
		
		list.add(product.getPname());
		list.add(product.getMarket_price());
		list.add(product.getShop_price());
		
		list.add(product.getIs_hot());
		list.add(product.getPdesc());
		list.add(product.getCid());
		
		list.add(product.getPid());
		try {
			qr.update(sql, list.toArray());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("修改商品信息失败");
		}
	}

}
