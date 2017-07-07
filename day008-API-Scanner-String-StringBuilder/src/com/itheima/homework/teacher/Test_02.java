package com.itheima.homework.teacher;

import java.util.Scanner;

/*
 * 第二题：分析以下需求，并用代码实现
	1.键盘录入一个大字符串,再录入一个小字符串
	2.统计小字符串在大字符串中出现的次数
	3.代码运行打印格式:
		请输入大字符串:javajava I love java l like jajavava I enjoy javajavajava
		请输入小字符串:heima
		控制台输出:小字符串heima,在大字符串woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma中共出现3次
		
		woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma
		1:,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma
		2:butongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma
		3:haishibaima,zhaodaogongzuojiushihaoma
 */
public class Test_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个大字符串");
		String str = sc.nextLine();
		System.out.println("请输入一个小字符串");
		String str1 = sc.nextLine();

		/*
		 * 两个明确 返回值类型 int 参数列表 String str,String str1;
		 */

		int count = getNum(str, str1);
		System.out.println(count);
	}

	public static int getNum(String str, String str1) {

		//
		int length;
		int count = 0;
		while ((length = str.indexOf(str1)) >= 0) {
			str = str.substring(length + str1.length());
			count++;
		}
		return count;
	}
}
