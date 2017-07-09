package com.itheima.chenjiewen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 *   ��������ʱ������̨��ʾ�û�����ע����û��������룻
       ��֤����¼����û�����user.txt����ע����û����Ƿ��ظ���
       �ǣ�����̨��ʾ���û����Ѵ���
       �񣺽�����¼����û���������д��user.txt�ļ������ڿ���̨��ʾ��ע��ɹ���
 */
public class UserDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new FileReader("user.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("user.txt",true));
        String line;
        String name = null;
        while ((line=br.readLine())!=null) {
            System.out.println("������ע���û���:");
            name=sc.nextLine();
            //System.out.println(line);
            boolean b=line.startsWith(name);
            System.out.println(b);
            if (b) {
                System.out.println("�û����Ѵ���!");
            } else {
                break;
            }
        }
        System.out.println("������ע������:");
        String psw=sc.nextLine();
        bw.write(name);
        bw.write(',');
        bw.write(psw);
        bw.newLine();
        System.out.println("ע��ɹ�!");
        bw.flush();
        br.close();
        bw.close();
        
        
    }
}
