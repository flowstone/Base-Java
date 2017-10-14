package me.xueyao.dao.impl;


import org.springframework.stereotype.Repository;

import me.xueyao.dao.UserDao;


@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
       System.out.println("持久层：保存数据"); 
    }


}
