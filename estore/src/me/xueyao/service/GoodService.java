package me.xueyao.service;

import java.util.List;

import me.xueyao.domain.Good;

public interface GoodService {

	/**
	 * 查询所有商品
	 * @return
	 */
	List<Good> findAll();

}
