package org.xueyao.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.xueyao.dao.CategoryDao;
import org.xueyao.domain.Category;
import org.xueyao.utils.JDBCUtils;

public class CategoryDaoImpl implements CategoryDao {
	
	private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO category VALUES(?,?)";
		try {
			qr.update(sql, category.getCid(), category.getCname());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("添加分类失败");
		}
	}
	@Override
	public List<Category> findAll() {
		String sql = "SELECT * FROM category";
		try {
			return qr.query(sql, new BeanListHandler<Category>(Category.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("查询分类信息失败");
		}
	}
	@Override
	public Category findById(String cid) {
		String sql = "SELECT * FROM category WHERE cid=?";
		try {
			return qr.query(sql, new BeanHandler<Category>(Category.class), cid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("没有该分类信息");
		}
	}
	@Override
	public void update(Category category) {
		String sql = "UPDATE category SET cname=? WHERE cid=?";
		try {
			qr.update(sql, category.getCname(), category.getCid());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("更新分类信息失败");
		}
	}
	
	//categoryDao===============================
	private QueryRunner run = new QueryRunner();
	@Override
	public void delete(String cid) {
		String sql = "DELETE FROM category WHERE cid = ?";
		try {
			run.update(JDBCUtils.getCurrentConnection(), sql, cid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("删除分类信息失败");
		}
	}
	@Override
	public void release(String cid) {
		// TODO Auto-generated method stub
		String sql = "update product set cid = null where cid = ?";
		try {
			run.update(JDBCUtils.getCurrentConnection(), sql, cid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("解除关系失败");
		}
	}

}
