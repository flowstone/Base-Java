package org.xueyao.produce.service;

import java.sql.SQLException;
import java.util.List;

import org.xueyao.produce.dao.ProductDao;
import org.xueyao.produce.domain.Product;

public class ProductService {

	public List<Product> findAllProduct() throws SQLException {
		ProductDao productDao = new ProductDao();
		
		return productDao.findAllProducts();
	}

}
