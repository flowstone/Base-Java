package me.xueyao.dao.impl;

import me.xueyao.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("持久层：用户保存");
    }

    @Override
    public Integer delete() {
        int i = 10 / 0;
        System.out.println("持久层：用户删除...");
        return 100;
    }

    @Override
    public void update() {
        System.out.println("持久层：用户更新...");
    }

    @Override
    public void list() {
        System.out.println("持久层：用户查询");
    }

}
