package me.xueyao.filter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.xueyao.domain.User;

public class PrivilegeFilter implements Filter{
	
	//保存权限的数据
	private List<String> adminList = new ArrayList<>();
	
	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("=========权限数据加载==========");
		//读取admin.txt配置,一行一行的读
		//找到文件位置
		String realPath = config.getServletContext().getRealPath("/WEB-INF/classes/admin.txt");
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(new File(realPath)));
			String line = null;
			while ((line = reader.readLine()) != null) {
				adminList.add(line);
			}
			System.out.println(adminList);
			System.out.println("=========权限数据加载完成==========");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		//获取请求路径 
		String requestURI = req.getRequestURI();
		
		requestURI = requestURI.substring(req.getContextPath().length());
		
		System.out.println(requestURI);
		
		//判断当前请求,是否包含在管理员权限中(判断是否存在adminList集合中)
		
		boolean contains =  adminList.contains(requestURI);
		if (contains) {
			//包含,需要管理
			User loginUser = (User)req.getSession().getAttribute("loginUser");
			if (loginUser != null && loginUser.getRole().equals("admin")) {
				//当前用户是管理员,放行
				chain.doFilter(req, res);
			} else {
				res.sendRedirect(req.getContextPath()+"/login.jsp");
			}
		} else {
			//不包含,放行
			chain.doFilter(req, res);
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
