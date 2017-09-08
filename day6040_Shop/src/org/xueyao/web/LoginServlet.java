package org.xueyao.web;

import java.io.IOException;

import javax.servlet.ServletException;
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
			System.out.println(user);
			
			UserService userService = new UserServiceImpl();
			User loginUser = userService.login(user);
			if (null == loginUser) {
				request.setAttribute("msg", "用户名或密码错误");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
				return;
			} else {
				request.getSession().setAttribute("loginUser", loginUser);
				response.sendRedirect(request.getContextPath());
			}
		}
	}

}