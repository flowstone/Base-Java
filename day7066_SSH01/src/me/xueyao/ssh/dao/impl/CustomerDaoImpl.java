package me.xueyao.ssh.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import me.xueyao.ssh.dao.CustomerDao;
import me.xueyao.ssh.domain.Customer;

public class CustomerDaoImpl implements CustomerDao {

    private SessionFactory sessionFactory;
    
    
    
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Customer customer) {
        System.out.println("客户保存...");
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(customer);
        session.getTransaction().commit();
    }

    @Override
    public Customer findById(Long id) {
        System.out.println("根据id查询客户...");
        return null;
    }

}
