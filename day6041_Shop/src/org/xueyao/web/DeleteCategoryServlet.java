package org.xueyao.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.xueyao.service.CategoryService;
import org.xueyao.service.impl.CategoryServiceImpl;

/**
 * 删除分类
 * @author XueYao
 *
 */
public class DeleteCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获得要删除分类的id
		String cid = request.getParameter("cid");
		CategoryService categoryService = new CategoryServiceImpl();
		categoryService.delete(cid);
		response.sendRedirect(request.getContextPath()+"/findAllCategory");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
