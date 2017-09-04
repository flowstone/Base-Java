package org.xueyao.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieDemo04 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//测试会话级别的Cookie(没有设置Cookie的有效期)
		//创建一个Cookie对象,设置了路径,发送Cookie
		Cookie ck = new Cookie("k3", "value3");
		ck.setPath("/day5037_Servlet_Cookie_Session");
		response.addCookie(ck);
		
		response.getWriter().print("ok");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
