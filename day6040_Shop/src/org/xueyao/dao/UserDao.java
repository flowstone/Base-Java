package org.xueyao.dao;

import org.xueyao.domain.User;

public interface UserDao {
	/**
	 * 用户登录
	 * @param user
	 * @return
	 */
	User login(User user);

}
