package me.xueyao.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.xueyao.base.BaseServlet;
import me.xueyao.domain.Cart;
import me.xueyao.domain.Order;
import me.xueyao.domain.OrderItems;
import me.xueyao.domain.User;
import me.xueyao.service.OrderService;
import me.xueyao.service.impl.OrderServiceImpl;
import me.xueyao.utils.UUIDUtils;

public class OrderServlet extends BaseServlet {

	/**
	 * 添加到订单
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void addOrder(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//判断用户是否登录
		User loginUser = (User)request.getSession().getAttribute("loginUser");
		if (null == loginUser) {
			response.sendRedirect(request.getContextPath()+"/login.jsp");
			return;
		}
		
		String province = request.getParameter("province");
		String city = request.getParameter("city");
		String district = request.getParameter("district");
		
		String detailAddress = request.getParameter("detailAddress");
		String zipcode = request.getParameter("zipcode");
		String name = request.getParameter("name");
		String telephone = request.getParameter("telephone");
		
		//使用UUID生成订单号
		String oid = UUIDUtils.getUUID();
		//登录用户的id
		int uid = loginUser.getId();
		//总价
		double totalprice = 0;
		
		List<Cart> cList = (List<Cart>)request.getSession().getAttribute("cList");
		
		List<OrderItems> oiList = new ArrayList<OrderItems>();
		
		for (Cart cart : cList) {
			totalprice = totalprice + cart.getGood().getEstoreprice() * cart.getBuynum();
			
			OrderItems oi = new OrderItems();
			oi.setBuynum(cart.getBuynum());
			oi.setGid(cart.getGid());
			oi.setOid(oid);
			
			oiList.add(oi);
			
		}
		//设置订单状态(1：待付款)
		int status = 1;
		//设置订单的创建时间
		Date createtime = new Date();
		
		//设置订单的地址
		String address = province+"(省/市)"+city+"(市/区)"+district+"(县/镇)"+detailAddress+"邮编:"+
				zipcode + "姓名:" + name + "电话:"+telephone;
		System.out.println(address);
		Order order = new Order();
		order.setId(oid);
		order.setUid(uid);
		order.setTotalprice(totalprice);
		order.setAddress(address);
		order.setStatus(status);
		order.setCreatetime(createtime);
		
		order.setOiList(oiList); 
		//TODO: 测试
		System.out.println(order);
		
		//调用Service方法,添加订单
		OrderService orderService = new OrderServiceImpl();
		orderService.addOrder(order);
		
		response.sendRedirect(request.getContextPath()+"/orders.jsp");
	}	
	/**
	 * 查看订单列表
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void findAll(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		User loginUser = (User)request.getSession().getAttribute("loginUser");
		if (null == loginUser) {
			response.sendRedirect(request.getContextPath()+"/login.jsp");
			return;
		}
		
		int uid = loginUser.getId();
		OrderService orderService = new OrderServiceImpl();
		List<Order> oList = orderService.findAll(uid);
		
		request.setAttribute("oList", oList);
		request.getRequestDispatcher("/orders.jsp").forward(request, response);
		
	}
}
