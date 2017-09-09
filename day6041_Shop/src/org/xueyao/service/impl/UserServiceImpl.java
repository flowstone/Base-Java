package org.xueyao.service.impl;

import org.xueyao.dao.UserDao;
import org.xueyao.dao.impl.UserDaoImpl;
import org.xueyao.domain.User;
import org.xueyao.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao = new UserDaoImpl();
	
	@Override
	public User login(User user) {
		//调用dao登录用户
		return userDao.login(user);
	}

}
