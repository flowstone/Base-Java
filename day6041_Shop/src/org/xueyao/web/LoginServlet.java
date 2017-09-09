package org.xueyao.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.xueyao.domain.User;
import org.xueyao.service.UserService;
import org.xueyao.service.impl.UserServiceImpl;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//表单输入的验证码
		String checkCode = request.getParameter("inputCheckCode");
		//界面生成的验证码
		String generateCode = (String)request.getSession().getAttribute("checkcode");
		//如果用户输入的验证码不正确
		if (!generateCode.equalsIgnoreCase(checkCode)) {
			request.setAttribute("msg", "验证码错误");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;
		} else {
			User user = new User();
			try {
				//封装数据到user对象中
				BeanUtils.populate(user, request.getParameterMap());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			//System.out.println(user);
			
			UserService userService = new UserServiceImpl();
			User loginUser = userService.login(user);
			if (null == loginUser) {
				//用户名或密码错误,则在request中保存错误信息
				request.setAttribute("msg", "用户名或密码错误");
				//并跳转到登录页面
				request.getRequestDispatcher("/login.jsp").forward(request, response);
				return;
			} else {
				//==================记住用户名start===================
				String on = request.getParameter("on");
				if ("on".equals(on)) {
					Cookie cookie = new Cookie("username", loginUser.getEmail());
					cookie.setMaxAge(60*60*24);
					cookie.setPath("/");
					response.addCookie(cookie);
				} else {
					Cookie cookie = new Cookie("username","");
					cookie.setMaxAge(0);
					cookie.setPath("/");
					response.addCookie(cookie);
				}
				//==================记住用户名end===================
				//如果用户名和密码正确,把用户的信息保存到session中
				request.getSession().setAttribute("loginUser", loginUser);
				//并重定向到首页
				response.sendRedirect(request.getContextPath());
				return ;
			}
		}
	}

}