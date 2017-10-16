package me.xueyao.test;

import java.beans.PropertyVetoException;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class TestJdbcTemplate {
    
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
}
