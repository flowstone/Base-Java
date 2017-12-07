package me.xueyao.mapper;

import me.xueyao.pojo.User;

import java.util.List;

/**
 * @author XueYao
 * @date 2017-12-06
 */
public interface UserMapper {

    /**
     * 查询用户
     * @param id 用户id
     * @return 用户对象
     */
    User queryUserById(Long id);

    /**
     * 查询所有用户
     * @return 用户对象集合
     */
    List<User> queryUserAll();

    /**
     * 添加用户
     * @param user 用户对象
     */
    void insertUser(User user);

    /**
     * 更新用户
     * @param user 用户对象
     */
    void updateUser(User user);

    /**
     * 删除用户
     * @param id 用户id
     */
    void deleteUserById(Long id);
}
