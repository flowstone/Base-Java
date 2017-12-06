package me.xueyao.mapper;


import me.xueyao.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @author XueYao
 * @date 2017-12-06
 */
public class UserMapperTest {

    private UserMapper userMapper;
    @Before
    public void setUp() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        this.userMapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void testQueryUserById() {
        User user =this.userMapper.queryUserById(1L);
        System.out.println(user);
    }

    @Test
    public void testQueryUserAll() {
        List<User> users = this.userMapper.queryUserAll();
        for (User user : users) {
            System.out.println(user);
        }


    }

    @Test
    public void testInsertUser() {
        User user = new User();
        user.setUserName("xiaoming");
        user.setPassword("123456");
        user.setName("小明");
        user.setAge(18);
        user.setSex(1);
        user.setBirthday(new Date());
        this.userMapper.insertUser(user);

    }

    @Test
    public void testUpdateUser() {
        User user = this.userMapper.queryUserById(6L);
        user.setAge(1);
        user.setPassword("11111");
        this.userMapper.updateUser(user);

    }

    @Test
    public void testDeleteUserById() {
        this.userMapper.deleteUserById(1L);
    }
}
