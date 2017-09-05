package org.xueyao.produce.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.xueyao.produce.domain.Product;
import org.xueyao.produce.service.ProductService;



public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//调用业务层功能:查询全部商品的信息,返回集合
		ProductService productService = new ProductService();
		List<Product> list = null;
		try {
			list = productService.findAllProduct();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//将查询到的所有商品信息放入到request域对象内
		request.setAttribute("allProdcut", list);
		//转发到/showAllPro.jsp
		request.getRequestDispatcher("/showAllPro.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
