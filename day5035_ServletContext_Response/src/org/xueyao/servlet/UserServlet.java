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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置表单请求的字符编码
		request.setCharacterEncoding("utf-8");
		//设置响应的字符编码
		response.setContentType("text/html;charset=utf-8");
		//通过request对象获得提交的用户名和密码
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//创建User对象,存放用户名和密码
		User user = new User();
		user.setUsername(username);
		user.setUserpass(password);
		
		UserService userService = new UserService();
		User uu = null;
		try {
			uu = UserService.login(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//用于判断用户是否登录成功
		if (null != uu) {
			PrintWriter out = response.getWriter();
			out.print("登录成功");
		} else {
			PrintWriter out = response.getWriter();
			out.print("登录失败");
		}
	}

}
