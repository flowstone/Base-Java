package me.xueyao.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import me.xueyao.dao.UserDao;
import me.xueyao.domain.User;
import me.xueyao.utils.DBUtils;

public class UserDaoImpl implements UserDao {
	private QueryRunner qr = new QueryRunner(DBUtils.getDataSource());
	@Override
	public User findByName(String email) {
		String sql = "SELECT * FROM user WHERE email=?";
		
		try {
			return qr.query(sql, new BeanHandler<User>(User.class), email);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("查询用户失败");
		}
	}

	@Override
	public void register(User user) {
		String sql = "INSERT INTO user VALUES(NULL,?,?,?,?,?,?)";
		
		Object[] params = {user.getEmail(), user.getNickname(), user.getPassword(),user.getRole(), user.getState(), user.getCode()};
		try {
			 qr.update(sql, params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("注册用户失败");
		}
	}

	@Override
	public User findByCode(String code) {
		String sql = "SELECT * FROM user WHERE code = ?";
		
		try {
			return qr.query(sql, new BeanHandler<User>(User.class), code);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("激活码不存在 ");
		}
	}
	@Override
	public void active(int id) {
		String sql = "UPDATE  user SET state = ? WHERE id = ?";
		try {
			qr.update(sql, 1, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("激活账号失败");
		}
	}



}
