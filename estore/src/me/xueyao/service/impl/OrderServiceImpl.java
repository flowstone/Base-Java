package me.xueyao.service.impl;

import java.sql.SQLException;
import java.util.List;

import me.xueyao.dao.CartDao;
import me.xueyao.dao.OrderDao;
import me.xueyao.dao.impl.CartDaoImpl;
import me.xueyao.dao.impl.OrderDaoImpl;
import me.xueyao.domain.Order;
import me.xueyao.service.OrderService;
import me.xueyao.utils.DBUtils;

public class OrderServiceImpl implements OrderService {

	private OrderDao orderDao = new OrderDaoImpl();
	private CartDao cartDao = new CartDaoImpl();
	
	@Override
	public void addOrder(Order order) {
		try {
			DBUtils.startTransaction();
			//添加订单
			orderDao.addOrder(order);
			//添加订单明细
			orderDao.addOrderItems(order.getOiList());
			//清空购物车
			cartDao.clear(order.getUid());
			//提交事务
			DBUtils.commit();
		} catch (Exception e) {
			try {
				DBUtils.rollBack();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			try {
				DBUtils.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public List<Order> findAll(int uid) {
		// TODO Auto-generated method stub
		return orderDao.findAll(uid);
	}

	

}
