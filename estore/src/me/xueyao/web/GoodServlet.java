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
	/**
	 * 查询指定的id商品
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	public void findById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int gid = Integer.parseInt(request.getParameter("gid"));
		
		//调用service方法,获取数据
		GoodService goodService = new GoodServiceImpl();
		Good good = goodService.findById(gid);
		
		request.setAttribute("good", good);
		//转发到商品信息页
		request.getRequestDispatcher("/goods_detail.jsp").forward(request, response);
		
	}

}
