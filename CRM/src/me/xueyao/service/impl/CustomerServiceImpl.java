package me.xueyao.service.impl;

import java.util.List;

import org.hibernate.Session;

import me.xueyao.dao.CustomerDao;
import me.xueyao.dao.impl.CustomerDaoImpl;
import me.xueyao.domain.Customer;
import me.xueyao.service.CustomerService;
import me.xueyao.utils.HibernateUtils;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDao customerDao = new CustomerDaoImpl();
	
	@Override
	public List<Customer> findAllCustomer() {
		Session session = HibernateUtils.getCurrentSession();
		session.beginTransaction();
		
		
		List<Customer> list = customerDao.findAllCustomer();
		
		session.getTransaction().commit();
		return list;
	}
	
	@Override
	public void save(Customer customer) {
		Session session = HibernateUtils.getCurrentSession();
		session.beginTransaction();
		customerDao.save(customer);
		session.getTransaction().commit();
		
	}

}
