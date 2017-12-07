package me.xueyao.mybatis.mapper;

import me.xueyao.mybatis.pojo.User;

/**
 * @author XueYao
 * @date 2017-12-07
 */
public interface UserMapper {
    /**
     * 查询指定id的用户
     * @param id 用户id
     * @return 用户对象
     */
    User queryUserById(Long id);
}
