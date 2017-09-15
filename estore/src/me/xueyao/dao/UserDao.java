package me.xueyao.dao;

import me.xueyao.domain.User;

public interface UserDao {
	/**
	 * 查询用户的方法
	 * @param email
	 * @return
	 */
	User findByName(String email);
	/**
	 * 注册用户
	 * @param user
	 * @return
	 */
	void register(User user);

	

}
