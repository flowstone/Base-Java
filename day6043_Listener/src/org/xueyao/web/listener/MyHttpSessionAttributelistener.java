package org.xueyao.web.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MyHttpSessionAttributelistener implements HttpSessionAttributeListener{

	@Override
	public void attributeAdded(HttpSessionBindingEvent se) {
		// TODO Auto-generated method stub
		System.out.println("MyHttpSessionAttributelistener....attributeAdded....");
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent se) {
		// TODO Auto-generated method stub
		System.out.println("MyHttpSessionAttributelistener....attributeRemoved....");

	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent se) {
		// TODO Auto-generated method stub
		System.out.println("MyHttpSessionAttributelistener....attributeReplaced....");

	}

}
