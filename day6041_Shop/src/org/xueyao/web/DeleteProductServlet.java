package org.xueyao.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.xueyao.service.ProductService;
import org.xueyao.service.impl.ProductServiceImpl;

public class DeleteProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pid = request.getParameter("pid");
		ProductService productService = new ProductServiceImpl();
		productService.delete(pid);
		
		response.sendRedirect(request.getContextPath()+"/adminFindAllProducts");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
