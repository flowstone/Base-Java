package me.xueyao.dao;

import me.xueyao.pojo.User;

import java.util.List;

/**
 * @author XueYao
 * @date 2017-12-06
 */
public interface UserDao {
    /**
     * 根据查询用户
     * @param id 用户id
     * @return 用户对象
     */
    User queryUserById(Long id);

    /**
     * 查询所有用户
     * @return 用户列表
     */
    List<User> queryUserAll();

    /**
     * 插入用户信息
     * @param user 用户对象
     */
    void insertUser(User user);

    /**
     * 更新用户信息
     * @param user 用户对象
     */
    void updateUser(User user);

    /**
     * 删除用户信息
     * @param id 用户id
     */
    void deleteUserById(Long id);


}
