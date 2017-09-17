package me.xueyao.dao.impl;

import java.sql.SQLException;
import java.util.List;

import me.xueyao.dao.CartDao;
import me.xueyao.domain.Cart;
import me.xueyao.domain.Good;
import me.xueyao.utils.DBUtils;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

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

	@Override
	public List<Cart> findAll(int uid) {
		String sql = "SELECT * FROM cart WHERE uid = ?";
		try {
			return qr.query(sql, new BeanListHandler<Cart>(Cart.class), uid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("查找用户购物车商品数据失败");
		}
	}

	@Override
	public Good findById(int gid) {
		String sql = "SELECT * FROM goods WHERE id = ?";
		try {
			return qr.query(sql, new BeanHandler<Good>(Good.class), gid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("查找当前商品数据失败");
		}
	}

}
