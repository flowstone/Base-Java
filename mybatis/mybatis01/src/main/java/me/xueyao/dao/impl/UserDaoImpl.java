package me.xueyao.dao.impl;

import me.xueyao.dao.UserDao;
import me.xueyao.pojo.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author XueYao
 * @date 2017-12-06
 */
public class UserDaoImpl implements UserDao{

    private SqlSession sqlSession;
    public UserDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public User queryUserById(Long id) {
        return sqlSession.selectOne("UserDaoMapper.queryUserById",id);
    }

    @Override
    public List<User> queryUserAll() {
        return sqlSession.selectList("UserDaoMapper.queryUserAll");
    }

    @Override
    public void insertUser(User user) {
        sqlSession.insert("UserDaoMapper.insertUser",user);
        sqlSession.commit();
    }

    @Override
    public void updateUser(User user) {
        sqlSession.update("UserDaoMapper.updateUser",user);
        sqlSession.commit();
    }

    @Override
    public void deleteUserById(Long id) {
        sqlSession.delete("UserDaoMapper.deleteUserById",id);
        sqlSession.commit();
    }
}
