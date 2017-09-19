package me.xueyao.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import me.xueyao.dao.OrderDao;
import me.xueyao.domain.Order;
import me.xueyao.domain.OrderItems;
import me.xueyao.utils.DBUtils;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;


public class OrderDaoImpl implements OrderDao {
	private QueryRunner qr = new QueryRunner();
	private QueryRunner qrr = new QueryRunner(DBUtils.getDataSource());
	
	@Override
	public void addOrder(Order order) {
		String sql = "INSERT INTO orders VALUES(?, ?, ?, ?, ?, ?)";
		try {
			Connection con = DBUtils.getCurrentConnection();
			Object[] params = {order.getId(), order.getUid(), order.getTotalprice(),
					order.getAddress(), order.getStatus(), order.getCreatetime()};
			qr.update(con, sql, params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("添加订单失败");
		}
		
	}

	@Override
	public void addOrderItems(List<OrderItems> oiList) {
		try {
			Connection con = DBUtils.getCurrentConnection();
			String sql = "INSERT INTO orderitems VALUES(?, ?, ?)";
			
			for (OrderItems oi : oiList) {
				qr.update(con, sql, oi.getOid(), oi.getGid(), oi.getBuynum());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("添加订单明细失败");
		}
	}

	@Override
	public List<Order> findAll(int uid) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM orders WHERE uid = ?";
		try {
			return qrr.query(sql, new BeanListHandler<Order>(Order.class), uid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("查询所有订单列表失败");
		}
	}

	@Override
	public Order findById(String oid) {
		String sql = "SELECT * FROM orders WHERE id = ?";
		try {
			return qrr.query(sql, new BeanHandler<Order>(Order.class), oid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("查询指定的id的订单数据失败");
		}
	}

	@Override
	public List<OrderItems> findByOid(String oid) {
		String sql = "SELECT * FROM orderitems WHERE oid = ?";
		try {
			return qrr.query(sql, new BeanListHandler<OrderItems>(OrderItems.class), oid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("查询指定的id的订单明细错误");
		}
	}

}
