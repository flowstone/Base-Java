package me.xueyao.listener;

import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import me.xueyao.service.OrderService;
import me.xueyao.service.impl.OrderServiceImpl;

/**
 * 创建一个监听器,监听项目启动
 * @author XueYao
 *
 */
public class ScanListener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		//创建定时器
		Timer timer = new Timer();
		//调用方法,设置定时任务
		//delay:执行任务前的延迟时间,单位是毫秒
		//根据你的项目大小,项目大,设置时间长
		//period: 执行各后续任务之间的时间间隔,单位是毫秒
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// 将过期订单设置他的状态为:3
				System.out.println("=========扫描订单开始=========");
				OrderService orderService = new OrderServiceImpl();
				orderService.scan();
				System.out.println("=========扫描订单结束=========");
				
				
			}
		}, 1000, 1000*60*60*2);
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}

}
