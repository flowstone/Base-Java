package me.xueyao.dao;

import java.util.List;

import me.xueyao.domain.Cart;
import me.xueyao.domain.Good;

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
	
	/**
	 * 查看当前用户购物车中所有商品数据
	 * @param uid
	 * @return
	 */
	List<Cart> findAll(int uid);
	/**
	 * 查询当前gid商品的信息
	 * @param gid
	 * @return
	 */
	Good findById(int gid);
	/**
	 * 删除购物车里的商品
	 * @param uid
	 * @param gid
	 */
	void delete(int uid, int gid);
	/**
	 * 清空购物车
	 * @param uid
	 */
	void clear(int uid);

}
