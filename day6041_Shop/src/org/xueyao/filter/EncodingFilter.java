package org.xueyao.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.xueyao.domain.MyRequest;

public class EncodingFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		//对中文进行统一编码处理
		//处理响应
		res.setContentType("text/html;charset=utf-8");
		//处理请求Get和Post需要根据当前的请求方式分开处理
		//对request对象,进行增加:修改getParameter() getParameterValues()  getParameterMap()
		//保证通过获取参数的方法,获取出来的数据是,中文数据
		
		//在不修改源代码的情况下,针对原来的对象,进行增加
		MyRequest myRequest = new MyRequest(req);
		System.out.println("name1:"+myRequest.getParameter("name"));
		System.out.println("name2:"+myRequest.getParameter("name"));
		//放行
		chain.doFilter(myRequest, res);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
