package org.xueyao.service.impl;

import java.util.List;

import org.xueyao.dao.ProductDao;
import org.xueyao.dao.impl.ProductDaoImpl;
import org.xueyao.domain.PageBean;
import org.xueyao.domain.Product;
import org.xueyao.service.ProductService;

public class ProductServiceImpl implements ProductService {
	
	private ProductDao productDao = new ProductDaoImpl();
	@Override
	public List<Product> findAll() {
		return productDao.findAll();
	}
	@Override
	public void delete(String pid) {
		productDao.delete(pid);
	}
	@Override
	public Product findProductById(String pid) {
		
		return productDao.findProductById(pid);
	}
	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		productDao.update(product);
	}
	@Override
	public PageBean page(int pageNum) {
		
		 int total = productDao.count();
		 //定义长度
		 int size = 6;
		 int end = total % size == 0 ?(total/size) : (total/size+1);
		 
		 List<Product> data = productDao.page((pageNum-1)*size, size);
		 
		 PageBean p = new PageBean();
		 p.setData(data);
		 p.setEnd(end);
		 p.setPageNum(pageNum);
		 
		 p.setSize(size);
		 p.setTotal(total);
		 
		 //将数据返回给调用 者
		 return p;
		 
	}

}
