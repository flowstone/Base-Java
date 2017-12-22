package me.xueyao.ssh.service.impl;

import me.xueyao.ssh.mapper.UserMapper;
import me.xueyao.ssh.pojo.User;
import me.xueyao.ssh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author XueYao
 * @date 2017-12-13
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        this.userMapper.addUser(user);
    }
}
