package org.xueyao.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.xueyao.dao.UserDao;
import org.xueyao.domain.User;
import org.xueyao.utils.JDBCUtils;

public class UserDaoImpl implements UserDao {
	private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
	
	
	@Override
	public User login(User user) {
		String sql = "SELECT * FROM users WHERE email=? AND password=?";
		
		try {
			return qr.query(sql, new BeanHandler<User>(User.class), user.getEmail(),user.getPassword());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("用户登录失败");
		}
	}

}
