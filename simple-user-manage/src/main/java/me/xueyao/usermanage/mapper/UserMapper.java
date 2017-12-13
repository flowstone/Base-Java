package me.xueyao.usermanage.mapper;

import me.xueyao.usermanage.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author XueYao
 * @date 2017-12-11
 */
public interface UserMapper {

    User queryUserById(Long id);

    List<User> queryUsers();

    List<User> queryUsersByPage(@Param("start") Integer start, @Param("pageSize") Integer pageSize);

    List<User> queryUserAll();

    int addUser(User user);

    int deleteUser(@Param("ids") String[] ids);
}
