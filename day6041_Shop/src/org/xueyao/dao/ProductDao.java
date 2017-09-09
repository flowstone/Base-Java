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

}
