package me.xueyao.service.impl;

import java.util.List;

import me.xueyao.dao.CartDao;
import me.xueyao.dao.impl.CartDaoImpl;
import me.xueyao.domain.Cart;
import me.xueyao.domain.Good;
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

	@Override
	public List<Cart> findAll(int uid) {
		List<Cart> list = cartDao.findAll(uid);
		for (Cart cart: list) {
			Good good = cartDao.findById(cart.getGid());
			cart.setGood(good);
		}
		return list;
	}

}
