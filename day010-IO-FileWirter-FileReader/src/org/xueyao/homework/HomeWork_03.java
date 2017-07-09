package org.xueyao.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * �����⣺�����������󣬲��ô���ʵ��
    ʵ��һ����֤��С����Ҫ�����£�
    1. ����Ŀ��Ŀ¼���½�һ���ļ���data.txt,����¼��3���ַ�����֤�룬������data.txt�У�Ҫ��һ����֤��ռһ�У�
    2. ����¼��һ����Ҫ��У�����֤�룬����������֤����data.txt�д��ڣ��ڿ���̨��ʾ��֤�ɹ�����������ڿ���̨��ʾ��֤ʧ�� 

 * @author Yao Xue
 * @date Jul 8, 2017 4:37:57 PM
 */
public class HomeWork_03 {
    public static void main(String[] args) throws IOException {
        String path = "data.txt";
      
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("�������"+(i+1)+"���ַ���");
            String verification = sc.nextLine();
            bufferedWriter.write(verification);
            bufferedWriter.newLine();
        }
        System.out.println("������֤��ɹ�");
        bufferedWriter.close();
        
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        System.out.println("��������ҪУ�����֤��");
        String string = sc.nextLine();
        String line;
        boolean flag = false;
        while ((line=bufferedReader.readLine())!= null) {
            if (line.equals(string)) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("��ѯ������֤��");
        } else {
            System.out.println("��֤�벻����");
        }
        bufferedReader.close();
    }
}
