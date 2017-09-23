package me.xueyao.service.impl;

import java.util.List;

import me.xueyao.dao.GoodDao;
import me.xueyao.dao.impl.GoodDaoImpl;
import me.xueyao.domain.Good;
import me.xueyao.domain.Page;
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
	@Override
	public Page page(int page, int rows) {

		//获取总记录数据
		int total = goodDao.count();
		//计算尾页
		int end = total % rows == 0 ?(total/rows):(total/rows)+1;
		//分页数据
		List<Good> data = goodDao.page((page - 1)*rows, rows);
		
		Page p = new Page();
		
		p.setEnd(end);
		p.setData(data);
		p.setPage(page);
		
		p.setRows(rows);
		p.setTotal(total);
		return p;
	}
	@Override
	public void add(Good g) {
		// TODO Auto-generated method stub
		goodDao.add(g);
	}

}
