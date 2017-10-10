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
			e.printStackTrace();
			throw new RuntimeException("添加订单明细失败");
		}
	}

	@Override
	public List<Order> findAll(int uid) {
		String sql = "SELECT * FROM orders WHERE uid = ?";
		try {
			return qrr.query(sql, new BeanListHandler<Order>(Order.class), uid);
		} catch (SQLException e) {
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
			e.printStackTrace();
			throw new RuntimeException("查询指定的id的订单明细错误");
		}
	}

	@Override
	public void deleteOrderItems(String oid) {
		String sql = "DELETE FROM orderitems WHERE oid = ?";
		try {
			qr.update(DBUtils.getCurrentConnection(), sql, oid);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("删除订单明细失败");
		}
	}

	@Override
	public void delete(String oid) {
		String sql = "DELETE FROM orders WHERE id = ?";
		try {
			qr.update(DBUtils.getCurrentConnection(), sql, oid);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("删除订单失败");
		}
	}

	@Override
	public List<Order> findByStatus(int i) {
		String sql = "SELECT * FROM orders WHERE status = ?";
		try {
			return qrr.query(sql, new BeanListHandler<Order>(Order.class), i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("根据指定的状态查询订单失败");
			
		}
	}

	@Override
	public void update(Order order) {
		String sql = "UPDATE orders SET status = ? WHERE id = ?";
		try {
			qrr.update(sql, order.getStatus(), order.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("修改指定订单的状态失败");
		}
		
	}

}
