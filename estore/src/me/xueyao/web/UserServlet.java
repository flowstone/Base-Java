package me.xueyao.web;



import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.xueyao.base.BaseServlet;
import me.xueyao.domain.User;
import me.xueyao.service.UserService;
import me.xueyao.service.impl.UserServiceImpl;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;


public class UserServlet extends BaseServlet {
	/**
	 * 用户注册功能
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("执行注册");
		String email = request.getParameter("email");
		if (StringUtils.isBlank(email)) {
			//用户为空
			request.setAttribute("msg", "用户不能为空!!!");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
			return;
		}
		
		String nickname = request.getParameter("nickname");
		if (StringUtils.isBlank(nickname)) {
			request.setAttribute("msg", "昵称不能为空");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
			return;
		}
		
		String password = request.getParameter("password");
		if (StringUtils.isBlank(password)) {
			request.setAttribute("msg", "密码不能为空!!!");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
			return;
		}
		
		String confirm_password = request.getParameter("confirm_password");
		if (StringUtils.isBlank(confirm_password)) {
			request.setAttribute("msg", "确认密码不能为空");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
			return;
		}
		
		String captcha = request.getParameter("captcha");
		if (StringUtils.isBlank(captcha)) {
			request.setAttribute("msg", "验证码不能为空!!!");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
			return;
		}
		
		if (!password.equals(confirm_password)) {
			request.setAttribute("msg", "两次密码不一致");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
			return;
		}
		
		String code = (String)request.getSession().getAttribute("code");
		if (!code.equalsIgnoreCase(captcha)) {
			request.setAttribute("msg", "验证码错误!!!");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
			return;
		}
		
		User user = new User();
		try {
			BeanUtils.populate(user, request.getParameterMap());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("非法访问异常");
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("调用目标异常");
		}
		//测试使用
		System.out.println(user);
		
		//调用service方法,注册用户
		UserService userService = new UserServiceImpl();
		int info = userService.register(user);
		
		//根据返回值,不同处理
		if (info == 1) {
			//成功,跳转登陆页面
			response.sendRedirect(request.getContextPath()+"/login.jsp");
			return;
		} else if (info == -1) {
			//已经存在 
			request.setAttribute("msg", "用户名已经存在!!!");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
			return;
		} else {
			request.setAttribute("msg", "服务器忙!!!");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
			return;
		}
	}
	
	/**
	 * 邮件激活功能
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void active(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String code = request.getParameter("code");
		UserService userService = new UserServiceImpl();
		int info = userService.active(code);
		
		if (1 == info) {
			request.setAttribute("msg", "激活成功,请登录");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		} else {
			request.setAttribute("msg", "激活码失效,请重新注册");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
		}
	}

	/**
	 * ajax验证用户名是否存在
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void check(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		PrintWriter writer = response.getWriter();
		
		if (StringUtils.isBlank(email)) {
			//数据为空,发出响应-3
			writer.write(-3);
			return;
		}
		
		//调用service方法,校验用户名是否存在
		UserService userService = new UserServiceImpl();
		int state = userService.check(email);
		
		//直接将数据,发出响应到浏览器
		writer.write(state+"");
	}
	
	/**
	 * 用户登录
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		if (StringUtils.isBlank(email)) {
			request.setAttribute("msg", "用户名不能为空");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;
		}
		
		String password = request.getParameter("password");
		if (StringUtils.isBlank(password)) {
			request.setAttribute("msg", "密码不能为空");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;
		}
		
		UserService userService = new UserServiceImpl();
		User loginUser = userService.login(email, password);
		
		if (null == loginUser) {
			request.setAttribute("msg", "用户名、密码错误或者账号未激活");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;
		} else {
			//用户登录成功
			//============记住用户start==========
			String remember = request.getParameter("remember");
			if ("on".equals(remember)) {
				//需要记住用户名
				Cookie cookie = new Cookie("username",email);
				cookie.setMaxAge(60*60*24);
				cookie.setPath("/");
				response.addCookie(cookie);
			} else {
				//不需要记住用户名
				Cookie cookie = new Cookie("username","");
				cookie.setMaxAge(0);
				cookie.setPath("/");
				response.addCookie(cookie);
			}
			//============记住用户end============
			
			request.getSession().setAttribute("loginUser", loginUser);
			String url = (String)request.getSession().getAttribute("url");
			response.sendRedirect(url);
		}
	}
}
