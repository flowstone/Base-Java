package me.xueyao.dao.impl;


import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import me.xueyao.dao.CustomerDao;
import me.xueyao.domain.Customer;

@Controller("customerDao")
public class CustomerDaoImpl implements CustomerDao {
    
    //不需要再手动实体化，通过Spring依赖注入
    @Autowired
    private QueryRunner queryRunner;
    

/*
    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }
*/

    @Override
    public List<Customer> findAllCusotmer() {
        List<Customer> list = null;
        try {
            list = queryRunner.query("SELECT * FROM cst_customer", new BeanListHandler<Customer>(Customer.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}
