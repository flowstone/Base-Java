package me.xueyao.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.xueyao.base.BaseServlet;
import me.xueyao.domain.Cart;
import me.xueyao.domain.User;
import me.xueyao.service.CartService;
import me.xueyao.service.impl.CartServiceImpl;


public class CartServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

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
		
		request.setAttribute("cList", cList);
		request.getRequestDispatcher("/cart.jsp").forward(request, response);
		
	}
	

}
