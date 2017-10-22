package me.xueyao.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import me.xueyao.dao.AccountDao;
import me.xueyao.domain.Account;
import me.xueyao.rowmapper.AccountRowMapper;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{

    @Override
    public Account findById(Long id) {
        return this.getJdbcTemplate().queryForObject("select * from account where id = ?", new AccountRowMapper(), id);
    }

    @Override
    public void update(Account account) {
         this.getJdbcTemplate().update("update account set name = ?, money = ? where id = ?", account.getName(),account.getMoney(),account.getId());
    }


}
