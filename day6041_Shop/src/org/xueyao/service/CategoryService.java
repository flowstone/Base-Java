package org.xueyao.service;

import java.util.List;

import org.xueyao.domain.Category;

public interface CategoryService {
	/**
	 * 添加分类
	 * @param category
	 */
	void add(Category category);
	
	/**
	 * 显示所有分类
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
	
	/**
	 * 删除分类信息
	 * @param cid
	 */
	void delete(String cid);

}
