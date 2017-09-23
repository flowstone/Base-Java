package me.xueyao.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import me.xueyao.dao.GoodDao;
import me.xueyao.domain.Good;
import me.xueyao.domain.Hot;
import me.xueyao.utils.DBUtils;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

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
	public int count() {
		String sql = "SELECT count(*) FROM goods";
		try {
			return qr.query(sql, new ScalarHandler<Long>()).intValue();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("获取商品总数失败");
		}
	}

	@Override
	public List<Good> page(int i, int rows) {
		String sql = "SELECT * FROM goods LIMIT ?,?";
		try {
			return qr.query(sql, new BeanListHandler<Good>(Good.class), i, rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("获取商品分页数据失败");
		}
		
	}

	@Override
	public void add(Good g) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO goods VALUES(null,?,?,?,?,?,?,?)";
		List<Object> list = new ArrayList<>();
		list.add(g.getName());
		list.add(g.getMarketprice());
		list.add(g.getEstoreprice());
		
		list.add(g.getCategory());
		list.add(g.getNum());
		list.add(g.getImgurl());
		
		list.add(g.getDescription());
		try {
			qr.update(sql, list.toArray());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("上传商品失败");
		}
	}

	@Override
	public List<Hot> hot() {
		// TODO Auto-generated method stub
		String sql = "SELECT g.name, oi.gid, sum(oi.buynum) hot "
				+ "FROM orderitems oi, goods g WHERE oi.gid=g.id "
				+ "GROUP BY oi.gid ORDER BY hot DESC";
		try {
			return qr.query(sql, new BeanListHandler<Hot>(Hot.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("热门统计失败");
		}
	}

}
