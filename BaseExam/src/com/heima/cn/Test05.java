package com.heima.cn;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
 * . 
1.  在项目根路径下创建文件data.txt，data.txt中存放编程语言数据如下：
Java
PHP
IOS
Python
（data.txt文件和文件中的数据可以手动创建和录入，无需由程序生成）
2.   编写一个程序，将data.txt文件中的编程语言全部读取到ArrayList中，随机从集合中获取一个语言作为年度最佳语言，并在控制台打印输出；
     演示格式如下：本年度最佳语言：Java
         (20分)

 */
public class Test05 {
	public static void main(String[] args) throws IOException {
		ArrayList<String> arrayList = new ArrayList<String>();
		BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"));
		
		String line;
		while ((line=bufferedReader.readLine())!=null) {
			arrayList.add(line);
		}
		bufferedReader.close();
		
		Random random = new Random();
		int index = random.nextInt(4);
		System.out.println("本年度最佳语言："+arrayList.get(index));
	}
}
