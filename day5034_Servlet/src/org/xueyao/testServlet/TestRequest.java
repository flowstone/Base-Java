package org.xueyao.testServlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestRequest
 */
public class TestRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String[] values = request.getParameterValues("hobby");
		System.out.println("用户名:"+username+"密码:"+password);
		System.out.println("爱好:"+Arrays.toString(values));
		
		
		System.out.println("--- 完美分割线 ---");
		
		Map<String, String[]> map = request.getParameterMap();
		//遍历map
		for (Map.Entry<String, String[]> entry: map.entrySet()) {
			System.out.println(entry.getKey()+":");
			String[] value = entry.getValue();
			System.out.println(Arrays.toString(value));
		}
	}

}
