package com.heima.cn;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
 * . 
1.  ����Ŀ��·���´����ļ�data.txt��data.txt�д�ű�������������£�
Java
PHP
IOS
Python
��data.txt�ļ����ļ��е����ݿ����ֶ�������¼�룬�����ɳ������ɣ�
2.   ��дһ�����򣬽�data.txt�ļ��еı������ȫ����ȡ��ArrayList�У�����Ӽ����л�ȡһ��������Ϊ���������ԣ����ڿ���̨��ӡ�����
     ��ʾ��ʽ���£������������ԣ�Java
         (20��)

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
		System.out.println("�����������ԣ�"+arrayList.get(index));
	}
}
