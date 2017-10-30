package me.xueyao.crm.service;

import java.util.List;

import me.xueyao.crm.domain.User;

//用户操作业务层接口
public interface UserService {

	//保存用户
	public void saveUser(User user);

	//登录
	public User login(User user);

	//查询所有
	public List<User> findUserList();

}
