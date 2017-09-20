package me.xueyao.dao.impl;

import java.sql.SQLException;
import java.util.List;

import me.xueyao.dao.PCDDao;
import me.xueyao.domain.PCD;
import me.xueyao.utils.DBUtils;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

public class PCDDaoImpl implements PCDDao {

	private QueryRunner qr = new QueryRunner(DBUtils.getDataSource());
	@Override
	public List<PCD> getData(int pid) {
		String sql = "SELECT * FROM province_city_district WHERE pid = ?";
		try {
			return qr.query(sql, new BeanListHandler<PCD>(PCD.class), pid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("获取省市县数据失败");
		}
	}

}
