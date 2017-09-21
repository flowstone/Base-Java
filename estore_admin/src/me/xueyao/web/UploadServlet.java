package me.xueyao.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.xueyao.base.BaseServlet;

public class UploadServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	public  void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//从request对象中获取
		ServletInputStream in = request.getInputStream();
		
		int temp = 0;
		while((temp = in.read()) != -1) {
			System.out.write(temp);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
