package me.xueyao.service;

import java.util.List;

import me.xueyao.domain.Order;

public interface OrderService {
	/**
	 * 添加订单
	 * @param order
	 */
	void addOrder(Order order);

	
	/**
	 * 查看所有订单列表
	 * @param uid
	 */
	List<Order> findAll(int uid);

	/**
	 * 查看指定的订单信息
	 * @param oid
	 * @return
	 */
	Order findById(String oid);

	/**
	 * 删除指定的订单信息
	 * @param oid
	 */
	void delete(String oid);
	
	/**
	 * 扫描过期订单的方法
	 */
	void scan();
	
}
