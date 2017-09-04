package org.xueyao.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionDemo01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置本次响应内容类型
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//获取session对象
		HttpSession session = request.getSession();
		//向客户端输入sessionID
		out.print(session.getId()+"<br/>");
		//获取session的创建时间
		long creationTime = session.getCreationTime();
		out.print("session的创建时间是："+new Date(creationTime).toLocaleString()+"<br/>");
		//获取session的上次访问时间
		long lastAccessedTime = session.getLastAccessedTime();
		out.print("session的上次访问时间是："+new Date(lastAccessedTime).toLocaleString()+"<br/>");
		//session是否是刚创建
		out.print("session是否为新创建:"+session.isNew()+"<br/>");
		//向session中放入数据
		session.setAttribute("name", request.getRemoteAddr());
		
		out.print("session的有效时间为"+session.getMaxInactiveInterval()/60+"分钟<br/>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
