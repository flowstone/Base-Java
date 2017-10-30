package me.xueyao.crm.service;

import java.util.List;

import me.xueyao.crm.dao.UserDAO;
import me.xueyao.crm.domain.User;
import me.xueyao.crm.utils.MD5Utils;

//用户操作的业务层实现
public class UserServiceImpl implements UserService{
	//注入dao
	private UserDAO userDAO;
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}


	@Override
	public void saveUser(User user) {
		//加密
		user.setUser_password(MD5Utils.md5(user.getUser_password()));
		userDAO.save(user);
		
	}


	@Override
	public User login(User user) {
		//密码要加密
		return userDAO.findByUsernameAndPassword(user.getUser_code(),MD5Utils.md5(user.getUser_password()) );
	}


	@Override
	public List<User> findUserList() {
		
		return userDAO.findAll();
	}

}
