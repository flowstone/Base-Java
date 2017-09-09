package org.xueyao.dao;

import java.util.List;

import org.xueyao.domain.Category;

public interface CategoryDao {
	/**
	 * 添加分类
	 * @param category
	 */
	void add(Category category);
	
	/**
	 * 查看所有分类
	 * @return
	 */
	List<Category> findAll();
	
	/**
	 * 根据id查询分类信息
	 * @param cid
	 * @return
	 */
	Category findById(String cid);
	
	/**
	 * 更新分类信息
	 * @param category
	 */
	void update(Category category);

}
