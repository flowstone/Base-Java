package me.xueyao.service.impl;

import me.xueyao.dao.UserDao;
import me.xueyao.dao.impl.UserDaoImpl;
import me.xueyao.domain.User;
import me.xueyao.service.UserService;
import me.xueyao.utils.MD5Utils;
import me.xueyao.utils.MailUtils;
import me.xueyao.utils.UUIDUtils;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao = new UserDaoImpl();
	@Override
	public int register(User user) {
		try {
			// 调用dao查询用户名是否已经存在
			User findByName = userDao.findByName(user.getEmail());
			if (findByName != null) {
				//用户名存在,返回-1
				return -1;
			} else {
				//用户名不存在
				//设置注册用户的权限为user
				user.setRole("user");
				//设置未激活状态-1
				user.setState(-1);
				//设置激活码
				String code = UUIDUtils.getUUID()+UUIDUtils.getUUID();
				user.setCode(code);
				
				//用户密码加密
				user.setPassword(MD5Utils.getPassword(user.getPassword()));
				//开启注册用户
				userDao.register(user);
				
				//发送邮件
				//设置发送邮件的信息
				String path = "http://localhost/estore/user?methodName=active&code="+code;
				String emailMsg = "恭喜你,注册成功,请点击下面的链接进行激活<a href='"+path+"'>"+path+"</a>";
				
				MailUtils.sendMail(user.getEmail(), "商城账号激活邮件", emailMsg);
				return 1;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -2;
		}
		
	}

}
