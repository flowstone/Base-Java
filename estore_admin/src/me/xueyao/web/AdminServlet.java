package me.xueyao.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.xueyao.base.BaseServlet;
import me.xueyao.domain.Good;
import me.xueyao.domain.Page;
import me.xueyao.service.GoodService;
import me.xueyao.service.impl.GoodServiceImpl;
import flexjson.JSONSerializer;

public class AdminServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	public void findAllGood(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		GoodService goodService = new GoodServiceImpl();
		List<Good> findAll = goodService.findAll();
		//将数据转换成json格式
		String serialize = new JSONSerializer().serialize(findAll);
		//System.out.println(serialize);
		response.getWriter().write(serialize);
	}

	public void pageGood(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//请求参数(page:用户要看的页码   rows:一页多少行数据)
		int page = Integer.parseInt(request.getParameter("page"));
		int rows = Integer.parseInt(request.getParameter("rows"));
		//使用请求参数,获取分页数据
		//调用Service,获取分页数据
		GoodService goodService = new GoodServiceImpl();
		Page p = goodService.page(page,rows);
		
		Map map = new HashMap();
		map.put("total", p.getTotal());
		map.put("rows", p.getData());
		//将数据转换json格式
		String serialize = new JSONSerializer().include("rows").serialize(map);
		response.getWriter().write(serialize);
	}

}
