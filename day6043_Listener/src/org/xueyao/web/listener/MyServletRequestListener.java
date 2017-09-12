package org.xueyao.web.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletRequestListener implements ServletRequestListener{

	//监听request对象销毁的方法
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		System.out.println("MyServletRequestListener.....requestDestroyed...");
	}

	//监听request对象初始化的方法
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		System.out.println("MyServletRequestListener....requestInitalized...");
	}

}
