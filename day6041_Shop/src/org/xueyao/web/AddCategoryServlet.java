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
/**
 * 添加分类
 * @author XueYao
 *
 */
public class AddCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//获取输入框中的分类名
		String cname = request.getParameter("cname");
		Category category = new Category();
		category.setCname(cname);
		//使用UUID生成随机不相同的字符串,当作分类的id
		category.setCid(UUID.randomUUID().toString().replace("-", ""));
		
		CategoryService categoryService = new CategoryServiceImpl();
		//添加分类
		categoryService.add(category);
		//重定向
		response.sendRedirect(request.getContextPath()+"/findAllCategory");
	}

}