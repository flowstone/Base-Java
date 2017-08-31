package org.xueyao.service;

import java.sql.SQLException;

import org.xueyao.dao.UserDao;
import org.xueyao.domain.User;

public class UserService {

	public static User login(User user) throws SQLException {
		UserDao userDao = new UserDao();
		return userDao.login(user);
	}

	

}
