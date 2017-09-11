package org.xueyao.filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Filter是在Web应用程序中部署描述符中配置的
 * 部署描述符:web.xml
 * 定义一个过滤器:
 * 第一步:创建一个类,实现过滤器接口
 * 第二步:具体需要执行的过滤任务,写在doFilter
 * 第三步:过滤器需要在web.xml中配置
 * 
 * @author XueYao
 *
 */
public class MyFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("MyFilter....init....");
		
		System.out.println("getFilterName:"+filterConfig.getFilterName());
		System.out.println("getInitParameter:"+filterConfig.getInitParameter("haha"));
		System.out.println("getInitParameter:"+filterConfig.getInitParameter("heihei"));
		System.out.println(filterConfig.getServletContext());
		
		Enumeration<String> initParameterNames = filterConfig.getInitParameterNames();
		
		while (initParameterNames.hasMoreElements()) {
			System.out.println(initParameterNames.nextElement());
		}
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("MyFilter...doFilter...");
		//放行请求的方法
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
