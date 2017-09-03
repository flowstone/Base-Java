package org.xueyao.test01;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//利用request获取请求头
		
		//获取到所有请求头名称
		Enumeration<String> names = request.getHeaderNames();
		while (names.hasMoreElements()) {
			//获取到所有的请求头
			String name = names.nextElement();
			//根据name获取对应的请求头的值
			String value = request.getHeader(name);
			System.out.println(name+"===="+value);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
