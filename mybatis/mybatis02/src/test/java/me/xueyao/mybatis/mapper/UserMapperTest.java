package me.xueyao.mybatis.mapper;

import me.xueyao.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author XueYao
 * @date 2017-12-07
 */
public class UserMapperTest {
    private  UserMapper userMapper;
    @Before
    public void setUp() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        this.userMapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void testQueryUserById() throws Exception {
        User user = this.userMapper.queryUserById(1L);
        System.out.println(user);
    }

    /**
     * 查询表里的所有用户
     */
    @Test
    public void testQueryUsersByTableName() {
        List<User> userList = this.userMapper.queryUsersByTableName("tb_user");
        for (User user : userList) {
            System.out.println(user);
        }
    }


    @Test
    public void testLogin() {
        User login = this.userMapper.login("xiaoming", "123456");
        System.out.println(login);
    }

    @Test
    public void testLoginMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("userName", "xiaoming");
        map.put("password", "123456");
        User user = this.userMapper.loginMap(map);
        System.out.println(user);

    }

}