package me.xueyao.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
/**
* DBUtils工具类，提供数据库连接池对象和数据库连接对象
*/
public class DBUtils {
	private static final ComboPooledDataSource DATA_SOURCE = new ComboPooledDataSource();

	// 获取数据源
	public static DataSource getDataSource() {
		return DATA_SOURCE;
	}

	// 获取连接
	public static Connection getConnection() throws SQLException {
		return DATA_SOURCE.getConnection();
	}
}
