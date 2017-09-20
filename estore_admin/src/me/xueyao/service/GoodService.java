package me.xueyao.service;

import java.util.List;

import me.xueyao.domain.Good;
import me.xueyao.domain.Page;

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
	 * 获得分页数据
	 * @param page
	 * @param rows
	 * @return
	 */
	Page page(int page, int rows);

}
