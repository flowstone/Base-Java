package me.xueyao.test;

import java.beans.PropertyVetoException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import me.xueyao.dao.AccountDao;
import me.xueyao.domain.Account;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestJdbcTemplate {
    
    @Autowired
    private AccountDao accountDao;
    
    
    @Test
    public void test1() {
        //创建jdbc模板对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //创建c3p0数据源
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        
        try {
            dataSource.setDriverClass("com.mysql.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/t_201710_test");
            dataSource.setUser("root");
            dataSource.setPassword("xueyao123456");
            
        } catch (PropertyVetoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        jdbcTemplate.setDataSource(dataSource);
        
        //插入操作
        jdbcTemplate.update("insert into account(name,money) values(?,?)","张四", 1234.0);
    }
    
    @Test
    public void test2() {
        Account account = new Account();
        account.setName("Bile");
        account.setMoney(1000.0);
        accountDao.save(account);
        
    }
}
