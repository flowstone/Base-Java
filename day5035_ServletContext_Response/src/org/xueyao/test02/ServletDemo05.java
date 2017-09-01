package org.xueyao.test02;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletDemo05 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取src下配置文件中的内容
		//JavaSE,WEB都可以通过字节码加载器获取src下指定资源路径 
		ClassLoader classLoader = ServletDemo05.class.getClassLoader();
		//固定用法:获取class下指定文件资源
		InputStream is = classLoader.getResourceAsStream("conf02.properties");
		
		//通过properties读取指定资源文件中的内容
		Properties prop = new Properties();
		prop.load(is);
		String v1 = prop.getProperty("name01");
		String v2 = prop.getProperty("name02");
		
		System.out.println(v1);
		System.out.println(v2);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
