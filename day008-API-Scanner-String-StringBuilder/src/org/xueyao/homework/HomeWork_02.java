package org.xueyao.homework;

import java.util.Scanner;

/**
 * �ڶ��⣺�����������󣬲��ô���ʵ��
    1.����¼��һ�����ַ���,��¼��һ��С�ַ���
    2.ͳ��С�ַ����ڴ��ַ����г��ֵĴ���
    3.�������д�ӡ��ʽ:
        ��������ַ���:javajava I love java l like jajavava I enjoy javajavajava
        ������С�ַ���:heima
        ����̨���:С�ַ���heima,�ڴ��ַ���woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma�й�����3��
            
 * @author Yao Xue
 * @date Jul 5, 2017 4:30:37 PM
 */
public class HomeWork_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("��������ַ���");
        String bigStr = sc.nextLine();
        System.out.println("������С�ַ���");
        String smallStr = sc.nextLine();
        
        String[] chs = bigStr.split(smallStr);
        System.out.print("С�ַ���"+smallStr+",�ڴ��ַ���"+bigStr+"�й�����"+(chs.length-1)+"��");
       
    }
}
