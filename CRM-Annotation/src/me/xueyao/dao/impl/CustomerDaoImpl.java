package me.xueyao.dao.impl;

import java.util.List;

import org.hibernate.Session;

import me.xueyao.dao.CustomerDao;
import me.xueyao.domain.Customer;
import me.xueyao.utils.HibernateUtils;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public List<Customer> findAllCustomer() {
		Session session = HibernateUtils.getCurrentSession();
		List<Customer> list = session.createQuery("from Customer").list();
		return list;
	}

	@Override
	public void save(Customer customer) {
		Session session = HibernateUtils.getCurrentSession();
		session.save(customer);
		
	}

}
