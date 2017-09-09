package org.xueyao.service.impl;

import org.xueyao.dao.AdminDao;
import org.xueyao.dao.impl.AdminDaoImpl;
import org.xueyao.domain.Admin;
import org.xueyao.service.AdminService;

public class AdminServiceImpl implements AdminService {
	private AdminDao adminDao = new AdminDaoImpl();
	@Override
	public Admin login(Admin admin) {
		// TODO Auto-generated method stub
		return adminDao.login(admin);
	}

}
