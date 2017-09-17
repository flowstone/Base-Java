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

}
