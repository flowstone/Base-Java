package org.xueyao.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.xueyao.domain.Product;
import org.xueyao.service.ProductService;
import org.xueyao.service.impl.ProductServiceImpl;

public class FindAllProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//调用service方法,获取数据
		ProductService productService = new ProductServiceImpl();
		List<Product> pList = productService.findAll();
		//System.out.println(pList);
		//将数据转发到页面展示数据
		request.setAttribute("plist", pList);
		request.getRequestDispatcher("/product_list.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
