package me.xueyao.dao.impl;

import org.hibernate.Session;

import me.xueyao.dao.CustomerDao;
import me.xueyao.domain.Customer;

public class CustomerDaoImpl implements CustomerDao {
    
    private Session session;
    
    
    public void setSession(Session session) {
        this.session = session;
    }


    @Override
    public void save(Customer customer) {
        session.save(customer);
    }

}
