package org.xueyao.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.xueyao.domain.User;
import org.xueyao.service.UserService;


/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//接收表单参数 账户,密码
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//将接收到的账户,密码封装在一个对象上
		User user = new User();
		user.setUsername(username);
		user.setUserpass(password);
		
		//调用业务层功能:用户登录功能,返回用户对象
		UserService userService = new UserService();
		User uu = null;
		try {
			uu = UserService.login(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//通过判断用户对象是否为空,判断登录是否成功
		//如果用户登录成功,向客户端响应login ok
		if (null != uu) {
			PrintWriter out = response.getWriter();
			out.print("login OK");
		} else {
			PrintWriter out = response.getWriter();
			out.print("login Fail");
		}
		//如果用户登录失败,向客户端响应login fail
		
	}
	
	
	

}
