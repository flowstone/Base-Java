package me.xueyao.service.impl;

import java.util.List;

import me.xueyao.dao.GoodDao;
import me.xueyao.dao.impl.GoodDaoImpl;
import me.xueyao.domain.Good;
import me.xueyao.factory.BeanFactory;
import me.xueyao.service.GoodService;

public class GoodServiceImpl implements GoodService {
	//private GoodDao goodDao = new GoodDaoImpl();
	//private GoodDao goodDao = new GoodDaoImpl2();
	/**
	 * new 必须指定构造函数，程序员自己控制创建对象。
	 * 程序员懒，不喜欢改重复代码
	 * 
	 * 优化：
	 * 1 创建一个对象（BeanFactory），让它创建对象，传入接口名称
	 * 2 将创建对象的权利，反转给程序 控制反转（IOC）
	 * AOP 动态代理
	 * 
	 * */
	private GoodDao goodDao = BeanFactory.getBean("GoodDao");
	
	@Override
	public List<Good> findAll() {
		return goodDao.findAll();
	}
	@Override
	public Good findById(int gid) {
		return goodDao.findById(gid);
	}

}
