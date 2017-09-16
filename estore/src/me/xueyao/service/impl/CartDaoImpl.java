package me.xueyao.service.impl;

import java.sql.SQLException;

import me.xueyao.dao.CartDao;
import me.xueyao.domain.Cart;
import me.xueyao.utils.DBUtils;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

public class CartDaoImpl implements CartDao {
	
	private QueryRunner qr = new QueryRunner(DBUtils.getDataSource());
	
	@Override
	public Cart findByUidAndGid(int uid, int gid) {
		String sql = "SELECT * FROM cart WHERE uid = ? AND gid = ?";
		
		try {
			return qr.query(sql, new BeanHandler<Cart>(Cart.class), uid, gid);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("查询购物车数据失败");
		}
	}

	@Override
	public void add(Cart c) {
		String sql = "INSERT INTO cart VALUES(?, ?, ?)";
		try {
			qr.update(sql, c.getUid(), c.getGid(), c.getBuynum());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("添加购物车数据失败");
		}
	}

	@Override
	public void update(Cart cart) {
		// TODO Auto-generated method stub
		String sql = "UPDATE cart SET buynum = ? WHERE uid = ? AND gid = ?";
		try {
			qr.update(sql, cart.getBuynum(), cart.getUid(), cart.getGid());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("更新购物车数据失败");
		}
	}

}
