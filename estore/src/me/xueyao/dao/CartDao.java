package me.xueyao.dao;

import me.xueyao.domain.Cart;

/**
 * @author XueYao
 *
 */
public interface CartDao {

	/**
	 * 根据uid,gid查询商品
	 * @param uid
	 * @param gid
	 * @return
	 */
	Cart findByUidAndGid(int uid, int gid);
	
	/**
	 * 添加商品到购物车的方法
	 * @param c
	 */
	void add(Cart c);

	/**
	 * 更新商品到购物车的方法
	 * @param cart
	 */
	void update(Cart cart);

}
