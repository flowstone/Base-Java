package me.xueyao.dao.impl;

import java.sql.SQLException;
import java.util.List;

import me.xueyao.dao.GoodDao;
import me.xueyao.domain.Good;
import me.xueyao.utils.DBUtils;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

public class GoodDaoImpl implements GoodDao {

	private QueryRunner qr = new QueryRunner(DBUtils.getDataSource());
	
	@Override
	public List<Good> findAll() {
		String sql = "SELECT * FROM goods";
		
		try {
			return qr.query(sql, new BeanListHandler<Good>(Good.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("获取商品列表失败");
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
			throw new RuntimeException("获取指定商品详细失败");
		}
		
	}

	@Override
	public List<Good> newGood() {
		String sql = "SELECT * FROM goods ORDER BY id DESC LIMIT 0,5";
		try {
			return qr.query(sql, new BeanListHandler<Good>(Good.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("查看最新上架列表失败");
		}
	}

	@Override
	public List<Good> hotGood() {
		String sql = "SELECT g.*,sum(oi.buynum) hot "
				+ "FROM orderitems oi, goods g "
				+ "WHERE oi.gid=g.id "
				+ "GROUP BY oi.gid "
				+ "ORDER BY hot DESC LIMIT 0,5";
		try {
			return qr.query(sql, new BeanListHandler<Good>(Good.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("查看热卖商品列表失败");
		}
	}

}
