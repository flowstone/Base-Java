package org.xueyao.dao;

import org.xueyao.domain.Admin;

public interface AdminDao {
	/**
	 * 管理员登录
	 * @param admin
	 * @return
	 */
	Admin login(Admin admin);

}
