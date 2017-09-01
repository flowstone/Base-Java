package org.xueyao.test02;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo06 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//测试通过ServletContext获取WEB-INF下指定资源文件的信息
		//获取ServletContext对象
		ServletContext servletContext = getServletContext();
		//参数中出现"/"代表的是当前的项目
		InputStream is = servletContext.getResourceAsStream("/WEB-INF/conf/conf.properties");
		//通过Properties读取指定资源文件中的内容
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
