package org.xueyao.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JDBCUtils {
	//创建ComboPooledDataSource对象,读取的是命名的配置信息xueyao
	//private static ComboPooledDataSource dataSource=new ComboPooledDataSource("xueyao");
	//创建ComboPooledDataSource对象,读取的是默认的配置信息
	private static ComboPooledDataSource dataSource=new ComboPooledDataSource();
	
	//获取连接
	public static Connection getConnection(){
		
		try {
			return  dataSource.getConnection();			
		} catch (Exception e) {
			throw new RuntimeException("获取连接有误");
		}
	}
	
	
	//获取数据源
	public static DataSource getDataSource(){
		return dataSource;
	}
	
	public static void main(String[] args) {
		System.out.println(getConnection());
	}
	
	
	/**
	 * 释放资源
	 */
	public static void release(Connection con,Statement st,ResultSet rs){
		//6.释放资源。先开后关，后开先关。放在finally代码块中
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(st!=null){
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
