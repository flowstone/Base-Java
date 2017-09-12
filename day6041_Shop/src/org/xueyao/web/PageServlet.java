package org.xueyao.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.xueyao.domain.PageBean;
import org.xueyao.service.ProductService;
import org.xueyao.service.impl.ProductServiceImpl;

public class PageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//获取请求参数
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));
		//调用Service方法获取分类数据
		ProductService productService = new ProductServiceImpl();
		PageBean p = productService.page(pageNum);
		
		request.setAttribute("p", p);
		request.getRequestDispatcher("/product_list.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
