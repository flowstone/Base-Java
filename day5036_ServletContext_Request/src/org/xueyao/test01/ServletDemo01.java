package org.xueyao.test01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//GET /day34_v1/ServletDemo01?name=tom&age=18 HTTP/1.1
		
		System.out.println("request.getMethod():"+request.getMethod());
		//request.getMethod():GET
		
		System.out.println("request.getRequestURI():"+request.getRequestURI());
		//request.getRequestURI():/day36_v1/ServletDemo01
		
		System.out.println("request.getRequestURL():"+request.getRequestURL());
		//request.getRequestURL():http://192.168.30.22:8080/day36_v1/ServletDemo01
		
		System.out.println("request.getQueryString():"+request.getQueryString());
		//request.getQueryString():name=tom&age=18
		
		System.out.println("request.getProtocol():"+request.getProtocol());
		//request.getProtocol():HTTP/1.1
		
		System.out.println("request.getContextPath():"+request.getContextPath());
		//request.getContextPath():/day36_v1  (注意)
		
		System.out.println("request.getServletPath():"+request.getServletPath());
		//request.getServletPath():/ServletDemo01
		
		System.out.println("request.getRemoteAddr():"+request.getRemoteAddr());
		//request.getRemoteAddr():192.168.30.54    remote:远程的: 由于代码是运行在服务端,对于服务端来说,客户端就是远程的.
		
		System.out.println("request.getRemoteHost():"+request.getRemoteHost());
		//request.getRemoteHost():192.168.30.54  获取到客户端主机名称,如果没有传递到服务端,默认还是IP
		
		System.out.println("request.getRemotePort():"+request.getRemotePort());
		//request.getRemotePort():50378     远程机器的端口号
		
		System.out.println("request.getLocalAddr():"+request.getLocalAddr());
		//request.getLocalAddr():192.168.30.22  local:本地的  由于代码是运行在服务端的,本地的就是服务端的IP
		
		System.out.println("request.getLocalName():"+request.getLocalName());
		//request.getLocalName():dongzi-PC
		
		System.out.println("request.getLocalPort():"+request.getLocalPort());
		//request.getLocalPort():8080
		
		System.out.println("request.getServerName():"+request.getServerName());
		//request.getServerName():192.168.30.22
		
		System.out.println("request.getServerPort():"+request.getServerPort());
		//request.getServerPort():8080
		
		System.out.println("request.getScheme():"+request.getScheme());
		//request.getScheme():http
		
		
	}
	

}