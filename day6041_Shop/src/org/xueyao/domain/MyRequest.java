package org.xueyao.domain;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * 
 * @author XueYao
 *	1. MyRequest extends HttpServletRequestWrapper 直接实现接口内容太多,不现实,Wrapper他已经帮助我们实现,不用重复
 *  2. HttpServletRequest request 定义一个变量获取外部数据
 *  3. 改写要处理的方法
 *  4. 不需要改写的方法,调用原来(父类)的
 *  
 */
public class MyRequest extends HttpServletRequestWrapper {
	//定义一个成员变量,记住外部传入request对象,方便进行操作
	private HttpServletRequest request;
	//定义一个标记,用来控制编码一次执行
	private boolean flag = false;
	
	public MyRequest(HttpServletRequest request) {
		super(request);
		this.request = request;
	}
	
	//进行乱码处理,改写要获取参数的方法
	@Override
	public Map<String, String[]> getParameterMap() {
		//处理请求  Get和Post,需要根据当前的请求方式分开处理
		//获取请求方式 
		String method = request.getMethod();
		if ("post".equalsIgnoreCase(method)) {
			try {
				request.setCharacterEncoding("utf-8");
				return request.getParameterMap();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
				throw new RuntimeException("当前编码不存在!");
			}
		} else if ("get".equalsIgnoreCase(method)) {
			//手动编码,只能执行一次
			Map<String, String[]> map = request.getParameterMap();
			if (flag) {
				return map;
			} 
			if (map != null) {
				for (String key : map.keySet()) {
					String[] values = map.get(key);
					if (values != null) {
						for (int i=0; i<values.length; i++) {
							try {
								values[i] = new String(values[i].getBytes("iso-8859-1"),"utf-8");
							} catch (UnsupportedEncodingException e) {
								e.printStackTrace();
							}
						}
					}
				}
			} 
			//一次编码执行完成
			flag = true;
			return map;
			
		}else {
			return super.getParameterMap();
		}
	}
	
	@Override
	public String[] getParameterValues(String name) {
		Map<String, String[]> map = this.getParameterMap();
		if (map != null) {
			String[] values = map.get(name);
			return values;
		}
		
		
		return super.getParameterValues(name);
		
	}
	
	@Override
	public String getParameter(String name) {
		String[] values = this.getParameterValues(name);
		if (values != null) {
			return values[0];
		}
		return super.getParameter(name);
		
	}

}
