package me.xueyao.crm.web.action;

import java.io.IOException;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import me.xueyao.crm.domain.User;
import me.xueyao.crm.service.UserService;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

//用户操作的action
public class UserAction extends ActionSupport implements ModelDriven<User>{
	//声明一个数据对象
	private User user =new User();
	@Override
	public User getModel() {
		return user;
	}
	
	//注入service
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	//注册
	public String regist(){
		//获取表单数据(自动封装)
		//调用业务层保存
		userService.saveUser(user);
		//跳转到登录
		return LOGIN;
	}
	
	//登录
	public String login(){
		//获取参数（模型驱动）-没代码
		//调用业务层查询用户
		User loginUser=userService.login(user);
		//登录是否成功判断
		if(null==loginUser){
			//失败
			//提示用户
			addActionError("您输入的用户名或密码不正确！");
			//到登录
			return LOGIN;
		}else{
			//成功
			//用户放session
			ServletActionContext.getRequest().getSession().setAttribute("loginUser", loginUser);
			//主页跳转
			return SUCCESS;
		}
		
		
	}
	
	//查询所有用户
	public String listajax() throws Exception{
		List<User> userList= userService.findUserList();
		
		//将customerlist转换为json
		JSONArray jsonArray=JSONArray.fromObject(userList);
		//写入响应
		ServletActionContext.getResponse().setContentType("application/json;charset=utf-8");
		ServletActionContext.getResponse().getWriter().print(jsonArray.toString());
		return NONE;
	}

	
}
