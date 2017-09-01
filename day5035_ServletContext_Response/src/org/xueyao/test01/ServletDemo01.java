package org.xueyao.test01;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//测试ServiceContext,断点的形式观察内部结构
		int i= 23;
		//获取ServletContext对象
		ServletContext servletContext = getServletContext();
		System.out.println(servletContext);
		
		ServletConfig servletConfig = getServletConfig();
		servletConfig.getInitParameter("name01");
		servletConfig.getInitParameter("name02");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
