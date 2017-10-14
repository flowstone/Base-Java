package me.xueyao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import me.xueyao.dao.UserDao;
import me.xueyao.service.UserService;
//注解  组件value="userService",value可以省略
//@Component("userService")
@Service("userService")
public class UserServiceImpl implements UserService {
    //注入基本数据类型和String 类型数据 
    @Value("小明")
    private String name;
    
    //自动按照类型注入
    @Autowired
    @Qualifier("userDao2")
    private UserDao userDao;
    
    @Override
    public void save() {
        System.out.println("业务层：保存");
        System.out.println("用户名："+ name);
        userDao.save();
    }

}
