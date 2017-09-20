package me.xueyao.service;

import me.xueyao.domain.User;

public interface UserService {
	
	/**
	 * 注册用户
	 * @param user
	 * @return
	 */
	int register(User user);
	
	/**
	 * 邮件激活
	 * @param code
	 * @return
	 */
	int active(String code);
	/**
	 * 根据用户名校验用户是否存在
	 * @param username
	 * @return
	 */
	int check(String email);

	/**
	 * 登录的方法
	 * @param email
	 * @param password
	 * @return
	 */
	User login(String email, String password);

}
