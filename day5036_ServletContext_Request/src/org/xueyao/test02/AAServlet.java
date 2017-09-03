package org.xueyao.test02;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AAServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//测试通过request实现请求转发
		response.getWriter().print("AAAAAA");
		response.getWriter().print("AAAAAA");
		response.getWriter().print("AAAAAA");
		
		//向request中名称为attributes的map中放入数据
		request.setAttribute("name01", "小明");
		request.setAttribute("name02", "小红");
		
		//利用request实现请求转发,告诉tomcat我要去执行哪个Servlet
		RequestDispatcher dispatcher = request.getRequestDispatcher("/BBServlet");
		dispatcher.forward(request, response);
		
		response.getWriter().print("222222222");
		response.getWriter().print("222222222");
		System.out.println("##########");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
