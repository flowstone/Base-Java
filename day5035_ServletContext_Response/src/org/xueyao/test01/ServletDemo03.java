package org.xueyao.test01;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo03 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//测试向ServletContext获取数据
		ServletContext servletContext = getServletContext();
		System.out.println(servletContext.hashCode()+">>>>Demo03");
		//获取到ServletContext这个大Map中所有键的名称
		Enumeration<String> names = servletContext.getAttributeNames();
		//遍历names,获取每个name
		while (names.hasMoreElements()) {
			//获取每个name
			String name = names.nextElement();
			//通过name获取对应的值 
			Object value = servletContext.getAttribute(name);
			System.out.println(name+"<====>"+value);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
