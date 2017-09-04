package org.xueyao.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.xueyao.utils.CookieUtil;

public class CookieDemo03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取Cookie
		Cookie[] cks = request.getCookies();
		//遍历Cookie
		for (Cookie ck : cks) {
			//删除名称为key2的cookie对象
			if ("key2".equals(ck.getName())) {
				ck.setMaxAge(0);
				ck.setPath("/day5037_Servlet_Cookie_Session");
				response.addCookie(ck);
			}
		}
		/*
		Cookie ck = CookUtil.findCookieByName("key1", request.getCookies());
		if (null != ck) {
			ck.setMaxAge(0);
			ck.setPath("/day5037_Servlet_Cookie_Session");
			response.addCookie(ck);
		}*/
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
