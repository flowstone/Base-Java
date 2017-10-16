package me.xueyao.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import me.xueyao.dao.AccountDao;
import me.xueyao.domain.Account;

public class AccountDaoImpl implements AccountDao {

    private JdbcTemplate jdbcTemplate;
    
    
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }



    @Override
    public void save(Account account) {
         jdbcTemplate.update("insert into account(name,money) values(?,?)", account.getName(), account.getMoney());
         
    }

}
