package org.xueyao.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.xueyao.dao.AdminDao;
import org.xueyao.domain.Admin;
import org.xueyao.utils.JDBCUtils;

public class AdminDaoImpl implements AdminDao {
	private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
	@Override
	public Admin login(Admin admin) {
		String sql = "SELECT * FROM admin WHERE username=? AND password=?";
		
		try {
			return qr.query(sql, new BeanHandler<Admin>(Admin.class), admin.getUsername(),admin.getPassword());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("查询管理员信息失败");
		}
		
	}

}
