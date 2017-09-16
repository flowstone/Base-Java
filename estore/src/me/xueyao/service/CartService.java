package me.xueyao.service;

public interface CartService {
	/**
	 * 添加商品到购物车
	 * @param uid
	 * @param gid
	 */
	void addGoodToCart(int uid, int gid);

}
