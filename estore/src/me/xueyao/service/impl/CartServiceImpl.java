package me.xueyao.service.impl;

import me.xueyao.dao.CartDao;
import me.xueyao.domain.Cart;
import me.xueyao.service.CartService;

public class CartServiceImpl implements CartService {
	
	private CartDao cartDao = new CartDaoImpl();
	
	@Override
	public void addGoodToCart(int uid, int gid) {
		//获取当前商品
		Cart cart = cartDao.findByUidAndGid(uid, gid);
		if (null == cart) {
			//如果没有添加 过,创建新的购物车数据
			Cart c = new Cart();
			c.setBuynum(1);
			c.setGid(1);
			c.setGid(gid);
			c.setUid(uid);
			
			cartDao.add(c);
		} else {
			cart.setBuynum(cart.getBuynum()+1);
			cartDao.update(cart);
		}
	}

}
