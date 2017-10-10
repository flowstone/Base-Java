package me.xueyao.service;

import java.util.List;

import me.xueyao.domain.Good;

public interface GoodService {

	/**
	 * 查询所有商品
	 * @return 所有商品list集合
	 */
	List<Good> findAll();

	/**
	 * 根据gid查询商品
	 * @param gid 商品id
	 * @return 商品对象
	 */
	Good findById(int gid);
	
	/**
	 * 新品上架
	 * @return
	 */
	List<Good> newGood();
	
	/**
	 * 热卖商品
	 * @return
	 */
	List<Good> hotGood();

}
