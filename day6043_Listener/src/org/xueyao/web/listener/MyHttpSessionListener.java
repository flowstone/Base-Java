package org.xueyao.web.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements HttpSessionListener{


	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("MyHttpSessionListener.....sessionCreated.....");
		//监听创建加一
		ServletContext context = se.getSession().getServletContext();
		Integer onlineNum = (Integer)context.getAttribute("onlineNum");
		context.setAttribute("onlineNum", onlineNum + 1);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("MyHttpSessionListener.....sessionDestroyed.....");
		//监听销毁减一
		ServletContext context = se.getSession().getServletContext();
		Integer onlineNum = (Integer)context.getAttribute("onlineNum");
		context.setAttribute("onlineNum", onlineNum - 1);
	}

}
