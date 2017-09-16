package me.xueyao.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.xueyao.base.BaseServlet;
import me.xueyao.domain.Good;
import me.xueyao.service.GoodService;
import me.xueyao.service.impl.GoodServiceImpl;
public class GoodServlet extends BaseServlet {
	/**
	 * 查询所有商品
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GoodService goodService = new GoodServiceImpl();
		
		List<Good> gList = goodService.findAll();
		
		request.setAttribute("gList", gList);
		request.getRequestDispatcher("/goods.jsp").forward(request, response);
	}

}
