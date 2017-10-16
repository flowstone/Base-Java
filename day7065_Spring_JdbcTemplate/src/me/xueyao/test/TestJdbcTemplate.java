package me.xueyao.test;

import java.beans.PropertyVetoException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import me.xueyao.dao.AccountDao;
import me.xueyao.domain.Account;
import me.xueyao.rowmapper.AccountRowMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestJdbcTemplate {
    
    @Autowired
    private AccountDao accountDao;
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
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
    
    /**
     * JdbcTemplate之新增
     */
    @Test
    public void test3() {
        jdbcTemplate.update("insert into account(name,money) values(?,?)", "李四", 1000.0);
    }
    
    /**
     * JdbcTemplate之修改
     */
    @Test
    public void test4() {
        jdbcTemplate.update("update account set money=? where id=?", 5555.5, 1);
    }
    
    /**
     * JdbcTemplate之删除
     */
    @Test
    public void test5() {
        jdbcTemplate.update("delete from account where id=?", 4);
    }
    
    /**
     * JdbcTemplate之查询某列的值
     */
    @Test
    public void test6() {
        Double money = jdbcTemplate.queryForObject("select money from account where id = ?", Double.class, 1);
        System.out.println(money);
    }
    
    /**
     * JdbcTemplate之查询一个对象
     */
    @Test
    public void test7() {
        AccountRowMapper mapper = new AccountRowMapper();
        Account account = jdbcTemplate.queryForObject("select * from account where id = ?", mapper, 1);
        System.out.println(account);
    }
    
    /**
     * JdbcTemplate之查询一个集合
     */
    @Test
    public void test8() {
        AccountRowMapper mapper = new AccountRowMapper();
        List<Account> accounts = jdbcTemplate.query("select * from account", mapper);
        for (Account account : accounts) {
            System.out.println(account);
        }
        
    }
}
