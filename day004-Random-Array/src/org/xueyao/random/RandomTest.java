package org.xueyao.random;

import java.util.Random;
import java.util.Scanner;

/*
 * ������С��Ϸ����
 * ϵͳ����һ��1-100֮��������,��³�������� �Ƕ���
 */
public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        
        int randomNumber = r.nextInt(101)+1;
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("��������Ҫ�µ�����(1-100֮��)");
            int number = sc.nextInt(); 
            if (randomNumber > number) {
                System.out.println("�����������̫С��");
            } else if (randomNumber < number) {
                System.out.println("�����������̫����");
            } else {
                System.out.println("��ϲ�����¶���,��ý�Ʒһ������");
                break;
            }
        }
    }
}
