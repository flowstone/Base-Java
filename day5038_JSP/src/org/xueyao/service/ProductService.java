package org.xueyao.service;

import java.util.ArrayList;
import java.util.List;

import org.xueyao.domain.Product;



public class ProductService {
	public static List<Product> getAllProducts() {
		List<Product> list = new ArrayList<Product>();
		Product p1 = new Product("p001", "键盘", 33.2);
		Product p2 = new Product("p002", "鼠标", 33.3);
		Product p3 = new Product("p003", "钢笔", 33.4);
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		return list;
	}
}
