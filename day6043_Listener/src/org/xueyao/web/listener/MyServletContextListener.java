package org.xueyao.web.listener;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 自定义ServletContextListener
 * @author XueYao
 *
 */
public class MyServletContextListener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("监听ServletContext对象创建...");
		
		//获取定时器
		Timer timer = new Timer();
		//调用定时器的设置定时任务的方法
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// 在run方法中,书写,要执行的任务
				//业务:带点秒杀
				//获取的是服务器时间,用户,是没有办法控制
				//获取客户端时间,时间有客户控制,时间是不对的
				//一般遵循的原则,只要可以控制在服务器的,绝对不给客户端
				System.out.println(new Date().toLocaleString());
			}
		}, 0, 1000);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("监听ServletContext对象销毁...");
	}

}
