package me.xueyao.ssh.mapper;

import me.xueyao.ssh.pojo.User;

/**
 * @author XueYao
 * @date 2017-12-11
 */
public interface UserMapper {

    /**
     * 根据用户id查询用户信息
     * @param id
     * @return
     */
    User queryUserById(Long id);
}
