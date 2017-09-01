package org.xueyao.test02;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo07 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//测试通过ServletContext获取全局的配置参数
		ServletContext servletContext = getServletContext();
		//获取到web.xml中全局的配置参数中所有name  name01, name02
		Enumeration<String> names = servletContext.getInitParameterNames();
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			String value = servletContext.getInitParameter(name);
			System.out.println(name+"<--->"+value);
		}
		
	}

}
