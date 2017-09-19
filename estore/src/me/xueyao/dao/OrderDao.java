package me.xueyao.dao;

import java.util.List;

import me.xueyao.domain.Order;
import me.xueyao.domain.OrderItems;

public interface OrderDao {
	
	/**
	 * 添加订单
	 * @param order
	 */
	void addOrder(Order order);
	/**
	 * 添加订单明细
	 * @param oiList
	 */
	void addOrderItems(List<OrderItems> oiList);
	
	/**
	 * 查看所有订单列表
	 * @param uid
	 * @return
	 */
	List<Order> findAll(int uid);
	
	/**
	 * 查询指定id的订单详情
	 * @param oid
	 * @return
	 */
	Order findById(String oid);
	/**
	 * 查询指定id的订单明细
	 * @param oid
	 * @return
	 */
	List<OrderItems> findByOid(String oid);

}
