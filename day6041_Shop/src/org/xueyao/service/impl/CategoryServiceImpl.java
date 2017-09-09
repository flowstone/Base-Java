package org.xueyao.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.xueyao.dao.CategoryDao;
import org.xueyao.dao.ProductDao;
import org.xueyao.dao.impl.CategoryDaoImpl;
import org.xueyao.dao.impl.ProductDaoImpl;
import org.xueyao.domain.Category;
import org.xueyao.service.CategoryService;
import org.xueyao.utils.JDBCUtils;

public class CategoryServiceImpl implements CategoryService {
	
	private CategoryDao categoryDao = new CategoryDaoImpl();
	
	private ProductDao productDao = new ProductDaoImpl();
	
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
	@Override
	public void delete(String cid) {
		try {
			JDBCUtils.startTransaction();
			//释放外键
			categoryDao.release(cid);
			categoryDao.delete(cid);
			JDBCUtils.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				JDBCUtils.rollback();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			try {
				JDBCUtils.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
