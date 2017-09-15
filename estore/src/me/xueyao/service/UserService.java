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

}
