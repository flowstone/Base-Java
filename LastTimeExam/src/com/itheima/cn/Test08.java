package com.itheima.cn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *  1.��ǰ���̸�Ŀ¼�´���data2.txt�ļ��������ַ���������ļ���д��12342352.���ļ��н����ݶ�ȡ������ͳ���������ַ�'3'�ĸ�����
    2.��ͳ�Ƴ����Ľ�����������̨�ϣ�
 * @author Yao Xue
 * @date Jul 9, 2017 8:38:51 AM
 */
public class Test08 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data2.txt"));
        bufferedWriter.write("12342352");
        bufferedWriter.close();
        
        BufferedReader bufferedReader = new BufferedReader(new FileReader("data2.txt"));
        int ch;
        int count = 0;
        while ((ch=bufferedReader.read())!=-1) {
            if (ch == '3') {
                count++;
            }
        }
        System.out.println("count:"+count);
    }
}
