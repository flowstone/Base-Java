package org.xueyao.verifycode;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//获取用户表单数据  账户  密码  验证码
		String username = request.getParameter("username");
		String userpass = request.getParameter("userpass");
		String usercode = request.getParameter("usercode").toUpperCase();
		
		//获取session中的验证码
		String code01 = (String)request.getSession().getAttribute("ranCode");
		//移除session中的验证码
		request.getSession().removeAttribute("ranCode");
		
		//比较session中的验证码和表单提交过来的验证码是否一致
		if (null != usercode && usercode.equals(code01)) {
			if (null !=username&& null!=userpass&& "tom".equals(username)&& "1234".equals(userpass)) {
				request.getSession().setAttribute("username", username);
				response.sendRedirect("/day5037_Servlet_Cookie_Session/index.jsp");
			} else {
				out.print("账号或密码有误，3秒之后重新登录");
				response.setHeader("Refresh", "3;url=http://localhost/day5037_Servlet_Cookie_Session/login_verify.html");
			}
		} else {
			//如果不一致，直接向客户端响应：验证码有误，请重新输入，3秒之后重新访问登录页面
			out.print("验证码有误,请重新输入");
			response.setHeader("Refresh", "3;url=http://localhost/day5037_Servlet_Cookie_Session/login_verify.html");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
