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
/**
 * 后台查看所有商品
 * @author XueYao
 *
 */
public class AdminFindAllProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码
		request.setCharacterEncoding("utf-8");
		
		ProductService productService = new ProductServiceImpl();
		//获取数据库中的商品信息
		List<Product> findAll = productService.findAll();
		//在request中保存所有商品信息
		request.setAttribute("prolist", findAll);
		//转发
		request.getRequestDispatcher("/admin/product/list.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
