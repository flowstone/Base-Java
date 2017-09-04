package org.xueyao.cookie;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.xueyao.utils.CookieUtil;

public class VisitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//分析
		//获得客户端所有的Cookie
		Cookie[] cookies = request.getCookies();
		
		//查找指定名称的Cookie
		Cookie ck = CookieUtil.findCookieByName("visitTime", cookies);
		//如果没有指定名称的Cookie,显示欢迎
		if (null == ck) {
			System.out.println("欢迎第一次登录");
			Cookie newck = new Cookie("visitTime",System.currentTimeMillis()+"");
			response.addCookie(newck);
			response.getWriter().print("欢迎第一次登录");
		} else {
			//如果找到指定名称的Cookie,显示欢迎,并同时显示上次访问时间
			Long value = Long.parseLong(ck.getValue());
			System.out.println("欢迎登录,你上次登录的时间为"+ new Date(value).toLocaleString());
			response.getWriter().print("欢迎登录,你上次登录的时间为"+ new Date(value).toLocaleString());
			
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
