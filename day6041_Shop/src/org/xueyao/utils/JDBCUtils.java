package org.xueyao.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JDBCUtils {
	
	private static ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
	
	
	public static Connection getConnection() throws SQLException{
		return comboPooledDataSource.getConnection();
	}
	
	public static DataSource getDataSource(){
		return comboPooledDataSource;
	}
	
}
