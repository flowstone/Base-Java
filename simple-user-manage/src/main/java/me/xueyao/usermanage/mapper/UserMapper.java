package me.xueyao.usermanage.mapper;

import me.xueyao.usermanage.pojo.User;

import java.util.List;

/**
 * @author XueYao
 * @date 2017-12-11
 */
public interface UserMapper {

    User queryUserById(Long id);

    List<User> queryUsers();
}
