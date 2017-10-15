package me.xueyao.dao.impl;

import me.xueyao.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("持久层：用户保存");
    }

}
