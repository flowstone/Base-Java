package me.xueyao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import me.xueyao.domain.Account;

public class AccountRowMapper implements RowMapper<Account> {

    /**
     * 如何把账户表里的一行数据形成账户对象
     */
    @Override
    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
        Account account = new Account();
        account.setId(rs.getLong("id"));
        account.setName(rs.getString("name"));
        account.setMoney(rs.getDouble("money"));
        return account;
    }
    
    
}
