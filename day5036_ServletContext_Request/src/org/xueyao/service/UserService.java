package org.xueyao.service;

import java.sql.SQLException;

import org.xueyao.dao.UserDao;
import org.xueyao.domain.User;

public class UserService {

	public void regist(User user) throws SQLException {
		//调用DAO层注册功能
		UserDao userDao = new UserDao();
		userDao.addUser(user);
	}

}
