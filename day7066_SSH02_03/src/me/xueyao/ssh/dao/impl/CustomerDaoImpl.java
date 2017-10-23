package me.xueyao.ssh.dao.impl;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import me.xueyao.ssh.dao.CustomerDao;
import me.xueyao.ssh.domain.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {
/*
    private SessionFactory sessionFactory;
    
    
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
*/
    
    
    
    @Override
    public void save(Customer customer) {
        System.out.println("客户保存...");
        /*Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(customer);
        session.getTransaction().commit();*/
        this.getHibernateTemplate().save(customer);
    }

    @Override
    public Customer findById(Long id) {
        System.out.println("根据id查询客户...");
        return this.getHibernateTemplate().get(Customer.class, id);
    }

}
