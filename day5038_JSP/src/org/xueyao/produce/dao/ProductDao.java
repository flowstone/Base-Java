package org.xueyao.produce.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.xueyao.produce.domain.Product;
import org.xueyao.product.utils.JDBCUtils;

public class ProductDao {

	public List<Product> findAllProducts() throws SQLException {
		String sql = "SELECT * FROM product";
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		
		return queryRunner.query(sql, new BeanListHandler<Product>(Product.class));
	}

}
