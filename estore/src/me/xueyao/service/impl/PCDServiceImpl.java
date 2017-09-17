package me.xueyao.service.impl;

import java.util.List;

import me.xueyao.dao.PCDDao;
import me.xueyao.dao.impl.PCDDaoImpl;
import me.xueyao.domain.PCD;
import me.xueyao.service.PCDService;

public class PCDServiceImpl implements PCDService {

	private PCDDao pcdDao = new PCDDaoImpl();
	@Override
	public List<PCD> getData(int pid) {
		// TODO Auto-generated method stub
		return pcdDao.getData(pid);
	}

}
