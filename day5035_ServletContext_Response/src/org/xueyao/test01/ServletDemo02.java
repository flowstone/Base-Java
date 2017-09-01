package org.xueyao.test01;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//测试向ServletContext存入数据
		//获取ServletContext对象
		ServletContext servletContext = getServletContext();
		System.out.println(servletContext.hashCode()+">>>demo02");
		
		servletContext.setAttribute("name01", "小明");
		servletContext.setAttribute("name02", "小红");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
