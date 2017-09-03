package org.xueyao.test01;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo04
 */
public class ServletDemo04 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//测试向ServletContext移除数据
		//获取ServletContext
		ServletContext servletContext = getServletContext();
		System.out.println(servletContext.hashCode()+">>>>Demo");
		
		//移除数据
		servletContext.removeAttribute("name01");
		System.out.println("remove OK");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}