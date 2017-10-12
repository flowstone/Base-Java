package me.xueyao.dao.impl;

import me.xueyao.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("用户保存....");
    }
    
    public UserDaoImpl() {
        System.out.println("调用了UserDaoImpl的构造方法");
    }

    public void init() {
        System.out.println("调用init方法...");
    }
    
    public void destroy() {
        System.out.println("调用destroy方法...");
    }
    
}
