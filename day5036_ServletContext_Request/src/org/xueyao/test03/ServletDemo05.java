package org.xueyao.test03;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo05 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String um = request.getParameter("username");
		
		//Get方式向服务端传递的中文需要手动转码
		//以iso-8859-1获取到um,转换为utf-8编码
		String username = new String(um.getBytes("iso-8859-1"), "utf-8");
		System.out.println(username);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
