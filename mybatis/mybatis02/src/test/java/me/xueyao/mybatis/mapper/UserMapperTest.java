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
    SqlSession sqlSession = null;
    SqlSessionFactory sqlSessionFactory = null;
    @Before
    public void setUp() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        sqlSession = sqlSessionFactory.openSession(true);

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


    @Test
    public void testQueryUsersLikeUserName() {
        List<User> userList = this.userMapper.queryUsersLikeUserName("zhang");
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void testQueryUserByID() {
        User user = this.userMapper.queryUserById(8L);
        System.out.println(user);
    }

    @Test
    public void testQueryUserListUserName() {
        List<User> userList = this.userMapper.queryUserListLikeUserName(null);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void testQueryUserListLikeUserNameOrAge() {
        List<User> userList = this.userMapper.queryUserListLikeUserNameOrAge("xiaoming", 18);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void testQueryUserListLikeUserNameAndAge() {
        List<User> userList = this.userMapper.queryUserListLikeUserNameAndAge("xiaoming", 18);
        for (User user : userList) {
            System.out.println(user);

        }
    }


    @Test
    public void testUpdateUserSelective() {
        User user = new User();
        user.setSex(8);
        user.setUserName("xiaohua");
        user.setName("小华");
        user.setPassword("123456");
        user.setAge(18);
        user.setSex(1);

        this.userMapper.updateUserSelective(user);


    }


    @Test
    public void testQueryUserListByIds() {
        List<User> userList = this.userMapper.queryUserListByIds(new Long[]{1L, 3L, 4L});
        for (User user : userList) {
            System.out.println(user);

        }
    }

    @Test
    public void testCache() {
        User user = this.userMapper.queryUserById(1L);
        System.out.println(user);
        //强制清除缓存
        sqlSession.clearCache();
        System.out.println("===========完美分割线=========");
        User user1 = this.userMapper.queryUserById(1L);
        System.out.println(user1);

    }

    @Test
    public void testCache2() {
        User user = this.userMapper.queryUserById(1L);
        System.out.println(user);
        sqlSession.close();
        System.out.println("====分割线====");

        SqlSession sqlSession = sqlSessionFactory.openSession();
        this.userMapper= sqlSession.getMapper(UserMapper.class);
        User user1 = this.userMapper.queryUserById(1L);
        System.out.println(user1);


    }
}