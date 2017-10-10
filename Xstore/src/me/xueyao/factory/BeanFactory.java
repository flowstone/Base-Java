package me.xueyao.factory;

import java.util.ResourceBundle;

public class BeanFactory {
	
	public static <T>T getBean(String inter) { 
		System.out.println("工厂类创建对象。。。。");
		
		//使用一个工具读取properties文件
		ResourceBundle bundle = ResourceBundle.getBundle("bean");
		String className = bundle.getString(inter);
		
		//创建对象
		try {
			Class clazz = Class.forName(className);
			return (T)clazz.newInstance();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
}
