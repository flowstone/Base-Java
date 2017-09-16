package me.xueyao.dao;

import java.util.List;

import me.xueyao.domain.Good;

public interface GoodDao {
	
	/**
	 * 查询所有商品
	 * @return
	 */
	List<Good> findAll();

}
