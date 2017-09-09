package org.xueyao.service.impl;

import java.util.List;

import org.xueyao.dao.CategoryDao;
import org.xueyao.dao.impl.CategoryDaoImpl;
import org.xueyao.domain.Category;
import org.xueyao.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
	
	private CategoryDao categoryDao = new CategoryDaoImpl();
	@Override
	public void add(Category category) {
		categoryDao.add(category);
	}
	@Override
	public List<Category> findAll() {
		return categoryDao.findAll();
	}
	@Override
	public Category findById(String cid) {
		return categoryDao.findById(cid);
	}
	@Override
	public void update(Category category) {
		categoryDao.update(category);
	}

}
