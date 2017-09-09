package org.xueyao.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.xueyao.domain.Category;
import org.xueyao.service.CategoryService;
import org.xueyao.service.impl.CategoryServiceImpl;

/**
 * 更新分类信息
 * @author XueYao
 *
 */
public class UpdateCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Category category = new Category();
		try {
			BeanUtils.populate(category, request.getParameterMap());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		CategoryService categoryService = new CategoryServiceImpl();
		categoryService.update(category);
		response.sendRedirect(request.getContextPath()+"/findAllCategory");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
