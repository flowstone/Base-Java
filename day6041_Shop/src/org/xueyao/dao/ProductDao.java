package org.xueyao.dao;

import java.util.List;

import org.xueyao.domain.Product;

public interface ProductDao {
	/**
	 * 查询所有商品
	 * @return
	 */
	List<Product> findAll();
	
	/**
	 * 释放外键
	 * @param cid
	 */
	void release(String cid);
	
	/**
	 * 删除商品信息
	 * @param pid
	 */
	void delete(String pid);

	/**
	 * 查询指定pid的商品信息
	 * @param pid
	 * @return
	 */
	Product findProductById(String pid);
	
	/**
	 * 更新商品信息
	 * @param product
	 */
	void update(Product product);

}
