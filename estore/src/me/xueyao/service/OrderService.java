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
	

}
