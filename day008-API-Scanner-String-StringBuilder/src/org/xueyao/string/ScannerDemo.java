package org.xueyao.string;

import java.util.Scanner;

/**
 * Scannner:���ڻ�ȡ����¼������ݡ�(�����������ͣ��ַ�������)
 *          public String nextLine(); ��ȡ����¼����ַ������� 
 * @author Yao Xue
 *
 */
public class ScannerDemo {
    public static void main(String[] args) {
        //��������¼�����
        Scanner sc = new Scanner(System.in);
        
        //�������� 
        System.out.println("������һ���ַ������ݣ�");
        String s = sc.nextLine();
        
        //������ 
        System.out.println("s:"+s);
    }
}
