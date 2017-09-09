package org.xueyao.service.impl;

import java.util.List;

import org.xueyao.dao.ProductDao;
import org.xueyao.dao.impl.ProductDaoImpl;
import org.xueyao.domain.Product;
import org.xueyao.service.ProductService;

public class ProductServiceImpl implements ProductService {
	
	private ProductDao productDao = new ProductDaoImpl();
	@Override
	public List<Product> findAll() {
		return productDao.findAll();
	}

}
