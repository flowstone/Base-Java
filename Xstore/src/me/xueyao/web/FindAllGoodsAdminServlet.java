package me.xueyao.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.xueyao.domain.Good;
import me.xueyao.service.GoodService;
import me.xueyao.service.impl.GoodServiceImpl;
import flexjson.JSONSerializer;

public class FindAllGoodsAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			//调用Service方法获取数据
			GoodService goodService = new GoodServiceImpl();
			List<Good> gList = goodService.findAll();
			
			//将数据发送到浏览器
			String serialize = new JSONSerializer().serialize(gList);
			response.getWriter().write(serialize);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
