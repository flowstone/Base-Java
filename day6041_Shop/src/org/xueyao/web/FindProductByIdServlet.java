package org.xueyao.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.xueyao.domain.Category;
import org.xueyao.domain.Product;
import org.xueyao.service.CategoryService;
import org.xueyao.service.ProductService;
import org.xueyao.service.impl.CategoryServiceImpl;
import org.xueyao.service.impl.ProductServiceImpl;

/**
 * 根据商品id,查看对应的商品信息
 * @author XueYao
 *
 */
public class FindProductByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.setCharacterEncoding("utf-8");
		
		String pid = request.getParameter("pid");
		ProductService productService = new ProductServiceImpl();
		Product plist = productService.findProductById(pid);
		
		CategoryService categoryService = new CategoryServiceImpl();
		//获取所有分类信息
		List<Category> clist = categoryService.findAll();
		
		request.setAttribute("plist", plist);
		request.setAttribute("clist", clist);
		request.getRequestDispatcher("/admin/product/edit.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
