package me.xueyao.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import flexjson.JSONSerializer;
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
	
	/**
	 * 处理图片请求的方法
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public  void picture(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//获取请求参数
		String imgurl = request.getParameter("imgurl");
		
		//加载图片数据
		String realPath = getServletContext().getRealPath("/");
		
		realPath = realPath.replace("\\webapps\\estore", "");
		
		File file = new File(realPath, imgurl);
		
		//读取文件数据
		FileInputStream in = new FileInputStream(file);
		//向浏览器写出
		ServletOutputStream out = response.getOutputStream();
		//标准IO
		byte[] buf = new byte[8192];
		int len = 0;
		while ((len = in.read(buf))!= -1) {
			out.write(buf, 0, len);
		}
	}
	
	/**
	 * 新品上架
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void newGood(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GoodService goodService = new GoodServiceImpl();
		List<Good> newGoods = goodService.newGood();
		
		String serialize = new JSONSerializer().serialize(newGoods);
		response.getWriter().write(serialize);
		
	}
	
	/**
	 * 热卖商品
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void hotGood(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GoodService goodService = new GoodServiceImpl();
		List<Good> hotGoods = goodService.hotGood();
		
		String serialize = new JSONSerializer().serialize(hotGoods);
		response.getWriter().write(serialize);
	}
		
}
