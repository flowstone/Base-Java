package me.xueyao.service.impl;

import me.xueyao.dao.UserDao;
import me.xueyao.dao.impl.UserDaoImpl;
import me.xueyao.service.UserService;
import me.xueyao.utils.BeanFactory;

public class UserServiceImpl implements UserService {

//    private UserDao userDao = new UserDaoImpl();
    //采用工厂获取UserDao对象
    private UserDao userDao = (UserDao) BeanFactory.getBean("userDao");
    
    @Override
    public void save() {
        System.out.println("业务层：用户保存");
        userDao.save();
    }

}
