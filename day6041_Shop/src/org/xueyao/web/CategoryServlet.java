package org.xueyao.web;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.xueyao.domain.Category;
import org.xueyao.service.CategoryService;
import org.xueyao.service.impl.CategoryServiceImpl;

public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String cname = request.getParameter("cname");
		Category category = new Category();
		category.setCname(cname);
		category.setCid(UUID.randomUUID().toString().replace("-", ""));
		
		CategoryService categoryService = new CategoryServiceImpl();
		categoryService.add(category);
		response.sendRedirect(request.getContextPath()+"/findAllCategory");
	}

}