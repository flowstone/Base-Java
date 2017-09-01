package org.xueyao.test02;

import java.io.IOException;

import javax.activation.MimeType;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo08 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//测试通过ServletContext获取MIME类型
		
		//获取ServletContext对象
		ServletContext servletContext = getServletContext();
		//通过文件后缀名,servletContext在全局web.xml寻找avi对应的文件的mime类型
		String mimeType = servletContext.getMimeType("xxx.avi");
		System.out.println(mimeType);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
