package me.xueyao.test;

import me.xueyao.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author XueYao
 * @date 2017-12-06
 */
public class MybatisTest {
    public static void main(String[] args) throws IOException {
        SqlSession sqlSession = null;
        try {
            //指定mybatis全局配置文件
            String resource = "mybatis-config.xml";
            //读取全局配置文件
            InputStream inputStream = Resources.getResourceAsStream(resource);

            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession = sqlSessionFactory.openSession();
            User user = sqlSession.selectOne("UserMapper.queryUserById", 1L);
            System.out.println(user);
        }finally {
            //判断是否为空
            if (sqlSession!=null) {
                //释放资源
                sqlSession.close();
            }
        }

    }
}
