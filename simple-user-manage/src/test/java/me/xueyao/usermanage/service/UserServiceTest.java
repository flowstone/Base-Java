package me.xueyao.usermanage.service;

import me.xueyao.usermanage.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author XueYao
 * @date 2017-12-12
 */
public class UserServiceTest {

    private UserService userService;
    @Before
    public void setUp() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "spring/applicationContext.xml",
                "spring/applicationContext-mybatis.xml",
                "spring/applicationContext-transaction.xml"
        );

        this.userService = context.getBean(UserService.class);
    }

    @Test
    public void testAddUser() {
        User user = new User();
        user.setName("小华");
        user.setAge(18);
        User user1 = new User();
        user1.setName("小红");
        user1.setAge(19);
        this.userService.addUsers(user,user1);

    }
}