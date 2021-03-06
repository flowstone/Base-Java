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
        //获取输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建sqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream,"test");
        //获取sqlSession对象，openSession传入参数true，则说明事务自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

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
        user.setUserName("xiaohong");
        user.setPassword("123456");
        user.setName("小红");
        user.setAge(18);
        user.setSex(2);
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
