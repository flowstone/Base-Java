package me.xueyao.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import me.xueyao.base.BaseServlet;
import me.xueyao.domain.Cart;
import me.xueyao.domain.User;
import me.xueyao.service.CartService;
import me.xueyao.service.impl.CartServiceImpl;


public class CartServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	
	/** 添加商品到购物车
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void addGoodToCart(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//校验登录
		User loginUser = (User)request.getSession().getAttribute("loginUser");
		if (null == loginUser) {
			//用户未登录
			//将用户最后一次访问地址记录下来
			String referer = request.getHeader("Referer");
			request.getSession().setAttribute("url", referer);
			
			response.sendRedirect(request.getContextPath()+"/login.jsp");
			return;
		}
		//获取参数
		int gid = Integer.parseInt(request.getParameter("gid"));
		int uid = loginUser.getId();
		
		//调用Service方法,添加商品到购物车
		CartService cartService = new CartServiceImpl();
		cartService.addGoodToCart(uid,gid);
		
		//跳转中间页面
		response.sendRedirect(request.getContextPath()+"/buyorcart.jsp");
		
		
		
	}
	
	/**
	 * 查询购物车中的所有商品
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void findAll(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//校验用户
		User loginUser = (User)request.getSession().getAttribute("loginUser");
		if (null == loginUser) {
			response.sendRedirect(request.getContextPath()+"/login.jsp");
			return;
		}
		
		int uid = loginUser.getId();
		
		CartService cartService = new CartServiceImpl();
		List<Cart> cList = cartService.findAll(uid);
		
		//request.setAttribute("cList", cList);
		request.getSession().setAttribute("cList", cList);
		request.getRequestDispatcher("/cart.jsp").forward(request, response);
		
	}
	
	/**
	 * 更新购物车时商品的数量
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void updateNum(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//校验用户
		User loginUser = (User)request.getSession().getAttribute("loginUser");
		if (null == loginUser) {
			response.sendRedirect(request.getContextPath()+"/login.jsp");
			return;
		}
		
		//获取参数uid,gid,value
		int uid = loginUser.getId();
		int gid = Integer.parseInt(request.getParameter("gid"));
		int value = Integer.parseInt(request.getParameter("buynum"));
		
		Cart c = new Cart();
		c.setBuynum(value);
		c.setGid(gid);
		c.setUid(uid);
		
		CartService cartService = new CartServiceImpl();
		cartService.update(c);
		
		//重新从数据库中获取数据,展示效果(调用findAllCartsServlet)
		//需要将数据存入request对象,后期在页面展示数据
		//不需要以上操作,那么重定向
		response.sendRedirect(request.getContextPath()+"/cart?methodName=findAll");
	}
	
	/**
	 * 删除购物车中的商品
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void delete(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		User loginUser = (User)request.getSession().getAttribute("loginUser");
		if (null == loginUser) {
			response.sendRedirect(request.getContextPath()+"/login.jsp");
			return;
		}
		
		int uid = loginUser.getId();
		int gid = Integer.parseInt(request.getParameter("gid"));
		
		CartService cartService = new CartServiceImpl();
		cartService.delete(uid, gid);
		
		response.sendRedirect(request.getContextPath()+"/cart?methodName=findAll");
	}
	
}
