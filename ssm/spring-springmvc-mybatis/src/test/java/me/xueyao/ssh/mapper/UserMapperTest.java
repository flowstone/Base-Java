package me.xueyao.ssh.mapper;

import me.xueyao.ssh.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author XueYao
 * @date 2017-12-11
 */
public class UserMapperTest {

    private UserMapper userMapper;
    @Before
    public void setUp() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "spring/applicationContext.xml","spring/applicationContext-mybatis.xml"
        );

        this.userMapper = applicationContext.getBean(UserMapper.class);

    }

    @Test
    public void testQueryUserById() {
        User user = this.userMapper.queryUserById(1L);
        System.out.println(user);
    }
}