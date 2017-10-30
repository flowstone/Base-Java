package me.xueyao.crm.dao;

import java.util.List;

import me.xueyao.crm.domain.User;

//用户dao
public interface UserDAO {

	/**
	 * 保存用户
	 * @param user
	 */
	public void save(User user);

	/**
	 * 
	 * @param user_code
	 * @param user_password
	 * @return
	 */
	public User findByUsernameAndPassword(String user_code, String user_password);

	public List<User> findAll();
	
	

}
