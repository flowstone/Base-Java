package org.xueyao.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.xueyao.domain.Category;
import org.xueyao.service.CategoryService;
import org.xueyao.service.impl.CategoryServiceImpl;

public class FindCategoryByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cid = request.getParameter("cid");
		CategoryService categoryService = new CategoryServiceImpl();
		Category category = categoryService.findById(cid);
		request.setAttribute("category", category);
		request.getRequestDispatcher("/admin/category/edit.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
