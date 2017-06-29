/*
第12题：分析以下需求，并用代码实现
	1.定义一个Test10类
	2.要求：在控制台打印以下数据(利用变量的方式)：
			(1)字符串变量s:		"不忘初心方得始终"
			(2)整数常量i1:		88,	i2:-88
			(3)小数常量d:		88.888
			(4)字符常量ch1:		'A',	ch2:'8'
			(5)布尔常量flag1:	true,	flag2 : false
*/

public class Test10 {
	public static void main(String[] args) {
		String s = "不忘初心方得始终";
		System.out.println(s);

		int i1 = 88;
		int i2 = -88;
		System.out.println(i1);
		System.out.println(i2);


		float d = 88.888F;
		System.out.println(d);

		char ch1 = 'A';
		char ch2 = '8';
		System.out.println(ch1);
		System.out.println(ch2);

		boolean flag1 = true;
		boolean flag2 = false;
		System.out.println(flag1);
		System.out.println(flag2);
	}
}