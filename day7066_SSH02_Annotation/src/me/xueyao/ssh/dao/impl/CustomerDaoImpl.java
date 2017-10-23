package me.xueyao.ssh.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import me.xueyao.ssh.dao.CustomerDao;
import me.xueyao.ssh.domain.Customer;

@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;
    
    @Override
    public void save(Customer customer) {
        System.out.println("客户保存...");
        hibernateTemplate.save(customer);
    }

    @Override
    public Customer findById(Long id) {
        System.out.println("根据id查询客户...");
        return hibernateTemplate.get(Customer.class, id);
    }

}
