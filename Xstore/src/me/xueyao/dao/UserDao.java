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
	/**
	 * 邮件激活
	 * @param id
	 */
	void active(int id);
	/**
	 * 查找邮件激活码
	 * @param code
	 * @return
	 */
	User findByCode(String code);
	/**
	 * 用户登录 
	 * @param email
	 * @param pwd
	 * @return
	 */
	User login(String email, String pwd);

	

}
