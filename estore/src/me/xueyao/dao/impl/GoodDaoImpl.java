package me.xueyao.dao.impl;

import java.sql.SQLException;
import java.util.List;

import me.xueyao.dao.GoodDao;
import me.xueyao.domain.Good;
import me.xueyao.utils.DBUtils;

import org.apache.commons.dbutils.QueryRunner;
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

}
