package me.xueyao.dao;

import java.util.List;

import me.xueyao.domain.Good;

public interface GoodDao {
	
	/**
	 * 查询所有商品
	 * @return  所有商品集合
	 */
	List<Good> findAll();
	/**
	 * 根据id查询商品信息
	 * @param gid  商品id
	 * @return  商品对象
	 */
	Good findById(int gid);
	/**
	 * 获取分页的总记录数据
	 * @return
	 */
	int count();
	/**
	 * 分页的方法
	 * @param i
	 * @param rows
	 * @return
	 */
	List<Good> page(int i, int rows);
	/**
	 * 添加商品的方法
	 * @param g
	 */
	void add(Good g);

}
