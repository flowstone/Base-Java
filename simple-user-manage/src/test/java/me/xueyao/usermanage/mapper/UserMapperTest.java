package me.xueyao.usermanage.mapper;

import javafx.application.Application;
import me.xueyao.usermanage.pojo.User;
import me.xueyao.usermanage.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author XueYao
 * @date 2017-12-11
 */
public class UserMapperTest {

    private UserMapper userMapper;
    @Before
    public void setUp() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml",
                "spring/applicationContext-mybatis.xml");
        this.userMapper = context.getBean(UserMapper.class);
    }

    @Test
    public void testQueryUserById() {
        User user = this.userMapper.queryUserById(3L);
        System.out.println(user);
    }

    @Test
    public void testQueryUsers() {
        List<User> users = this.userMapper.queryUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }

}