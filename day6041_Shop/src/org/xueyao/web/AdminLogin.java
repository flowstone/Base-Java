package org.xueyao.web;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.xueyao.domain.Admin;
import org.xueyao.service.AdminService;
import org.xueyao.service.impl.AdminServiceImpl;

public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdminService adminService = new AdminServiceImpl();
		Admin admin = new Admin();
		try {
			BeanUtils.populate(admin, request.getParameterMap());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		Admin testAdmin = adminService.login(admin);
		if (testAdmin == null) {
			request.setAttribute("msg", "管理员账号或者密码错误");
			request.getRequestDispatcher("admin/index.jsp").forward(request, response);;
			return;
		} else {
			request.getSession().setAttribute("user", testAdmin.getUsername());
			response.sendRedirect(request.getContextPath()+"/admin/home.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
