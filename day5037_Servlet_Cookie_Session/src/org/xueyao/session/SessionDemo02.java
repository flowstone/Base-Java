package org.xueyao.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionDemo02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置本次响应内容类型
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//获取session中的数据
		HttpSession session = request.getSession();
		String nm = (String)session.getAttribute("name");
		out.print("您放入的数据是："+nm+"<br/>");
		//向客户端输入sessionID
		out.println("SessionId"+session.getId()+"<br>");
		//获取创建时间
		long creationTime = session.getCreationTime();
		out.print("session的创建时间是："+new Date(creationTime).toLocaleString()+"<br/>");
		
		//获取session的上次访问时间
		long lastAccessedTime = session.getLastAccessedTime();
		out.print("session的上次访问时间是："+new Date(lastAccessedTime).toLocaleString()+"<br/>");
		
		//session是否是刚创建的
		out.print("session是否是新创建的"+session.isNew()+"<br/>");
		
		//向session中放入数据
		session.setAttribute("name", request.getRemoteAddr()+"<br/>");
		
		out.print("session的有效时间为："+session.getMaxInactiveInterval()/60+"分钟<br/>");
		//使用session失效
		session.invalidate();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
