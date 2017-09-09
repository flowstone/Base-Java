package org.xueyao.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.xueyao.domain.Category;
import org.xueyao.service.CategoryService;
import org.xueyao.service.impl.CategoryServiceImpl;

public class FindAllCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CategoryService categoryService = new CategoryServiceImpl();
		List<Category> list = categoryService.findAll();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/admin/category/list.jsp").forward(request, response);
	}

}