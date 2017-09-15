package me.xueyao.service;

import me.xueyao.domain.User;

public interface UserService {
	
	/**
	 * 注册用户
	 * @param user
	 * @return
	 */
	int register(User user);

}
