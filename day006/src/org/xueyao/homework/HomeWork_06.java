package org.xueyao.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * ������:�����������󣬲��ô���ʵ��        
    1.��ʾ�û�����10�����������뵽int�����У���������Ҫ��ʵ����ع���
    2.��ʾ�û�����һ��������Ϊ�������������������и�������Ӧ��Ԫ�أ�
        ����Ҫ�ж�����������Ƿ���0-9֮������ٽ�ֵ����������ֲ�����Ҫ�����������һ������Ҫ���������
    3.
     1  2   3  4   5
     2
     1  2   3  4    5 
     1  4   3  2    5        
 * @author Yao Xue
 * @date Jul 1, 2017 9:35:06 PM
 */
public class HomeWork_06 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("�������"+(i+1)+"����");
            arr[i] = sc.nextInt();
        }
        //int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        
        System.out.println("���ɵ��������£�");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                System.out.print(arr[i]+"]");
            } else {
                System.out.print(arr[i]+", ");
            }
           
        }
        System.out.println();
        
        
        System.out.println("������һ������(����)");
        int index = sc.nextInt();
        
        if (index == 0 || index == arr.length-1) {
            System.out.println("�����µ�Ԫ��ֵΪ"+arr[index]);
            Random r = new Random();
            index = r.nextInt(10);
            System.out.println("���ɵ�����Ϊ"+index);
            
        } else {
            System.out.println("�����µ�Ԫ��ֵΪ"+arr[index]);
            //��a�еõ���������Ӧ��Ԫ�ص���������Ԫ�ؽ��л���������Ӧ��Ԫ���ǵ�һ�������һ�������κβ���
            if (index > 0 || index < arr.length-1) {
                int temp = arr[index-1];
                arr[index-1] = arr[index+1];
                arr[index+1] = temp;
            }
        }
        System.out.println("�����Ľ����");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                System.out.print(arr[i]+"]");
            } else {
                System.out.print(arr[i]+", ");
            }
           
        }
        
        
        
    }
}
