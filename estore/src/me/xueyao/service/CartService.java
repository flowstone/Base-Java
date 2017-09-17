package me.xueyao.service;

import java.util.List;

import me.xueyao.domain.Cart;

public interface CartService {
	/**
	 * 添加商品到购物车
	 * @param uid
	 * @param gid
	 */
	void addGoodToCart(int uid, int gid);
	
	
	/**
	 * 查看当前用户的购物车商品数据
	 * @param uid
	 * @return
	 */
	List<Cart> findAll(int uid);

	/**
	 * 修改购物车商品的数量
	 * @param c
	 */
	void update(Cart c);

	/**
	 * 删除购物车里的商品
	 * @param uid
	 * @param gid
	 */
	void delete(int uid, int gid);

}
