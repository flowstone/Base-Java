package org.xueyao.service;

import org.xueyao.domain.User;

public interface UserService {
	/**
	 * 用户登录
	 * @param user
	 * @return
	 */
	User login(User user);
	
}
