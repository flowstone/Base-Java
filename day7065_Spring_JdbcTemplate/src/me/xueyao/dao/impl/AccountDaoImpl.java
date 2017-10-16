package me.xueyao.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import me.xueyao.dao.AccountDao;
import me.xueyao.domain.Account;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {


    @Override
    public void save(Account account) {
         this.getJdbcTemplate().update("insert into account(name,money) values(?,?)", account.getName(), account.getMoney());
         
    }

}
