package org.xueyao.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.xueyao.domain.Product;
import org.xueyao.service.ProductService;
import org.xueyao.service.impl.ProductServiceImpl;

/**
 * 更新商品信息
 * @author XueYao
 *
 */
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Product product = new Product();
		try {
			BeanUtils.populate(product, request.getParameterMap());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		ProductService productService = new ProductServiceImpl();
		productService.update(product);
		response.sendRedirect(request.getContextPath()+"/adminFindAllProducts");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
