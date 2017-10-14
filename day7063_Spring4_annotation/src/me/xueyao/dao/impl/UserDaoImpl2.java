package me.xueyao.dao.impl;

import org.springframework.stereotype.Repository;

import me.xueyao.dao.UserDao;

@Repository("userDao2")
public class UserDaoImpl2 implements UserDao {

    @Override
    public void save() {
        System.out.println("持久层2：保存用户");
    }

}
