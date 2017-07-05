package org.xueyao.homework;

import java.util.Scanner;


/**
 * ������: ������������,���ô���ʵ��
    1.����¼��һ���ַ���
    2.�����ַ�������ַ�����(����ʹ��toCharArray()����)
    3.���ַ������е����д�д��ĸ���Сд��ĸ(����ʹ��toLowerCase()����)
    4.�����һλ�����һλ�����ݲ���ͬ,�򽻻�
    5.���ַ�����������Ϊż����Ԫ�ر��'~'
    6.��ӡ����Ԫ�ص�����
    
 * @author Yao Xue
 * @date Jul 5, 2017 4:31:23 PM
 */
public class HomeWork_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ���");
        String str = sc.nextLine();
        //�����ַ�������ַ�����(����ʹ��toCharArray()����)
        char[] chs = createCharArray(str);
        
        //���ַ������е����д�д��ĸ���Сд��ĸ(����ʹ��toLowerCase()����)
        // A 65  Z 90  a  97   z 122
        chageLowerCase(chs);
        
       // �����һλ�����һλ�����ݲ���ͬ,�򽻻�
        exchange(chs);
        //5.���ַ�����������Ϊż����Ԫ�ر��'~'
        changeIndexValue(chs);
        //��ӡ����Ԫ�ص�����
        printAarray(chs);
    }
    
    public static void printAarray(char[] chs) {
        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i]+" ");
        }
    }

    public static void changeIndexValue(char[] chs) {
        for (int i = 1; i < chs.length; i=i+2) {
            chs[i] = '~';
        }
    }

    public static void exchange(char[] chs) {
        if (chs[0] != chs[chs.length-1]) {
            char temp = chs[chs.length-1];
            chs[chs.length-1] = chs[0];
            chs[0] = temp;
        }
    }

    public static void chageLowerCase(char[] chs) {
        for (int i = 0; i < chs.length; i++) {
            if (chs[i]>='A' && chs[i]<='Z') {
                chs[i] += 32;
            }
        }
    }

    public static char[] createCharArray(String str) {
        char[] chs = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chs[i] = str.charAt(i);
        }
        return chs;
    }
}
