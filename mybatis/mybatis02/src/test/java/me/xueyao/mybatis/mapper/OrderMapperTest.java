package me.xueyao.mybatis.mapper;

import me.xueyao.mybatis.pojo.Order;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * @author XueYao
 * @date 2017-12-08
 */
public class OrderMapperTest {
    private OrderMapper orderMapper = null;
    @Before
    public void setUp() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream stream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        orderMapper = sqlSession.getMapper(OrderMapper.class);

    }

    @Test
    public void testQueryOrderWithUser() throws Exception {
        Order order = this.orderMapper.queryOrderWithUser("20140921001");
        System.out.println(order);
    }

    @Test
    public void testQueryOrderWithUserDetail() {
        System.out.println(this.orderMapper.queryOrderWithUserDetail("20140921001"));
    }

    @Test
    public void testQueryOrderWithUserDetailItem() {
        System.out.println(this.orderMapper.queryOrderWithUserDetailItem("20140921001"));
    }

}