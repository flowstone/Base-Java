package org.xueyao.service;

import org.xueyao.domain.Admin;

public interface AdminService {
	
	/**
	 * 管理员登录
	 * @param admin
	 * @return
	 */
	Admin login(Admin admin);

}
