package com.itheima.cn;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 4 . 
1. ��Ŀ��·������1���ļ�data.txt�����ڴ�ų���д����ַ��� ���ļ��Ĵ��������ֶ�����������ʹ�ó��򴴽���
2. ʹ��ѭ����䣬ѭ��д��4������¼����ַ������ļ�data.txt�У�д���ַ���֮ǰ��Ҫ��ʾ��ǰ¼����ǵڼ����ַ���
��ʾ��ʽ�������£�ͼ1Ϊ������ʾ��ͼ2Ϊdata.txt�����ַ����ĸ�ʽ
 * @author Yao Xue
 * @date Jul 8, 2017 7:43:41 PM
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data.txt"));
        String[] str = new String[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("�������"+(i+1)+"�ַ���");
            str[i] = sc.nextLine();
            bufferedWriter.write(str[i]);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
        
    }
}
