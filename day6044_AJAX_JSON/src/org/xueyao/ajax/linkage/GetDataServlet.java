package org.xueyao.ajax.linkage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.xueyao.ajax.domain.Province;
import org.xueyao.ajax.utils.JDBCUtils;

import flexjson.JSONSerializer;

public class GetDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int parentid = Integer.parseInt(request.getParameter("parentid"));
		String sql = "SELECT * FROM province WHERE parentid=?";
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		try {
			List<Province> list = qr.query(sql, new BeanListHandler<Province>(Province.class), parentid);
			//System.out.println(list);
			
			//将list集合转换成json格式字符串
			JSONSerializer jsonSerializer = new JSONSerializer();
			String serialize = jsonSerializer.serialize(list);
			//System.out.println(serialize);
			
			//向页面输入字符串数据
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().write(serialize);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
