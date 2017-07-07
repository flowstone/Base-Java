package com.itheima.homework.teacher;

/*
 * 第一题：分析以下需求，并用代码实现
	1.定义如下方法public static String getPropertyGetMethodName(String property)
		功能描述:
			(1)该方法的参数为String类型，表示用户给定的成员变量的名字，返回值类型为String类型，返回值为成员变量对应的get方法的名字
			(2)如：用户调用此方法时给定的参数为"name",该方法的返回值为"getName"
	2.定义如下方法public static String getPropertySetMethodName(String property)
		功能描述:
			(1)该方法的参数为String类型，表示用户给定的成员变量的名字，返回值类型为String类型，返回值为成员变量对应的set方法的名字
			(2)如：用户调用此方法时给定的参数为"name",该方法的返回值为"setName"
 */
public class Test_01 {
	public static void main(String[] args) {
		System.out.println(getPropertyGetMethodName("nAMe"));
		System.out.println(getPropertySetMethodName("nAMe"));
	}

	// 如：用户调用此方法时给定的参数为"name",该方法的返回值为"getName"
	/*
	 * 1,字符串的拼接 
	 * 2， 要首字母变大写，后面的变小写，然后拼接起来
	 */
	public static String getPropertyGetMethodName(String property) {
		return getUppewLower(property,"get");
		}

	// 如：用户调用此方法时给定的参数为"name",该方法的返回值为"setName"
	/*
	 * 1,字符串的拼接 
	 * 2， 要首字母变大写，后面的变小写，然后拼接起来
	 */
	public static String getPropertySetMethodName(String property) {
		return getUppewLower(property,"set");
	}

	private static String getUppewLower(String property,String str) {
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.append(property.substring(0, 1).toUpperCase());
		sb.append(property.substring(1, property.length()).toLowerCase());
		return sb.toString();
	}
}
