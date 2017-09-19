package me.xueyao.service.impl;

import java.sql.SQLException;
import java.util.List;

import me.xueyao.dao.CartDao;
import me.xueyao.dao.GoodDao;
import me.xueyao.dao.OrderDao;
import me.xueyao.dao.impl.CartDaoImpl;
import me.xueyao.dao.impl.GoodDaoImpl;
import me.xueyao.dao.impl.OrderDaoImpl;
import me.xueyao.domain.Order;
import me.xueyao.domain.OrderItems;
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

	
	private GoodDao goodDao = new GoodDaoImpl();
	@Override
	public Order findById(String oid) {
		//获取订单
		Order o = orderDao.findById(oid);
		//获取订单明细
		List<OrderItems> oiList = orderDao.findByOid(oid);
		//获取订单明细相关的商品信息
		for (OrderItems oi : oiList) {
			oi.setGood(goodDao.findById(oi.getGid()));
		}
		o.setOiList(oiList);
		return o;
	}

	@Override
	public void delete(String oid) {
		// TODO Auto-generated method stub
		try {
			DBUtils.startTransaction();
			//删除订单明细
			orderDao.deleteOrderItems(oid);
			//删除订单
			orderDao.delete(oid);
			//提交事务
			DBUtils.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				//回滚事务
				DBUtils.rollBack();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} finally {
			try {
				//释放资源
				DBUtils.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	

}
