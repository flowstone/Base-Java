package org.xueyao.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
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

}
