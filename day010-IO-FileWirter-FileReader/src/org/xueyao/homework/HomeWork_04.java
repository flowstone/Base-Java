package org.xueyao.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * �����⣺�����������󣬲��ô���ʵ��
    1.��Ŀ��Ŀ¼�½����ļ��� user.txt���ļ��д���û����͵�¼���룬��ʽ���û���������,�磺aaa,123��
    2. user.txt�ļ��г�ʼ��ŵ��û���Ϣ�����£�
        jack,123
        rose,123
        tom,123
    3.Ҫ��������¹��ܣ�
      ��������ʱ������̨��ʾ�û�����ע����û��������룻
       ��֤����¼����û�����user.txt����ע����û����Ƿ��ظ���
       �ǣ�����̨��ʾ���û����Ѵ���
       �񣺽�����¼����û���������д��user.txt�ļ������ڿ���̨��ʾ��ע��ɹ���
       
 * @author Yao Xue
 * @date Jul 8, 2017 4:38:25 PM
 */
public class HomeWork_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("user.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("user.txt",true));
        Scanner sc = new Scanner(System.in);
        System.out.println("������ע����û���");
        String  name = sc.nextLine();
            
        String line;
        while ((line = bufferedReader.readLine())!=null) {

            String[] info =   line.trim().split(",");
            if (info[0].equals(name)) {
                System.out.println("�û����Ѵ���");
                System.exit(0);
            } 
        }
            
        System.out.println("������ע�������");
        String password = sc.nextLine();
        bufferedWriter.newLine();
        bufferedWriter.write(name+","+password);
        
        bufferedWriter.close();
        bufferedReader.close();
        System.out.println("ע��ɹ�");
    }
}
