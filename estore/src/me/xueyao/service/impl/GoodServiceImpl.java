package me.xueyao.service.impl;

import java.util.List;

import me.xueyao.dao.GoodDao;
import me.xueyao.dao.impl.GoodDaoImpl;
import me.xueyao.domain.Good;
import me.xueyao.service.GoodService;

public class GoodServiceImpl implements GoodService {
	
	private GoodDao goodDao = new GoodDaoImpl();
	@Override
	public List<Good> findAll() {
		return goodDao.findAll();
	}
	@Override
	public Good findById(int gid) {
		return goodDao.findById(gid);
	}

}
