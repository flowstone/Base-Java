package org.xueyao.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.xueyao.domain.User;
import org.xueyao.service.UserService;

public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//接收用户的表单参数
		String username = request.getParameter("username");
		String userpass = request.getParameter("userpass");
		String useremail = request.getParameter("useremail");
		String nickname = request.getParameter("nickname");
		String usersex = request.getParameter("usersex");
		String birthday = request.getParameter("birthday");
		
		User user = new User();
		user.setUsername(username);
		user.setUserpass(userpass);
		user.setUseremail(useremail);
		user.setNickname(nickname);
		user.setUsersex(usersex);
		user.setBirthday(birthday);
		
		UserService userService = new UserService();
		try {
			userService.regist(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("msg", "用户注册成功");
		request.getRequestDispatcher("/MsgServlet").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
