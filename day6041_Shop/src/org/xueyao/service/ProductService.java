package org.xueyao.service;

import java.util.List;

import org.xueyao.domain.PageBean;
import org.xueyao.domain.Product;

public interface ProductService {
	/**
	 * 查询所有商品信息
	 * @return
	 */
	List<Product> findAll();
	
	/**
	 * 删除商品信息
	 * @param pid
	 */
	void delete(String pid);
	
	/**
	 * 获取指定pid的商品信息
	 * @param pid
	 * @return
	 */
	Product findProductById(String pid);
	
	/**
	 * 更新商品信息
	 * @param product
	 */
	void update(Product product);
	/**
	 * 获取分页信息
	 * @param pageNum
	 * @return
	 */
	PageBean page(int pageNum);
	
}
