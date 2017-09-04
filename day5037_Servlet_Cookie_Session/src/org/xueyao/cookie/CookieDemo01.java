package org.xueyao.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieDemo01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie ck01 = new Cookie("key1","value01");
		Cookie ck02 = new Cookie("key2","value02");
		ck01.setMaxAge(60*60*24);
		ck02.setMaxAge(60*60*24);
		ck01.setPath("/day5037_Servlet_Cookie_Session");
		ck02.setPath("/day5037_Servlet_Cookie_Session");
		response.addCookie(ck01);
		response.addCookie(ck02);
		response.getWriter().print("okokok");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
