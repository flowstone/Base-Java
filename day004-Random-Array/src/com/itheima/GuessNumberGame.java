package com.itheima;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * ��������Ϸ
 * 
 * @author Yao Xue
 * @date Jun 29, 2017 9:47:18 AM
 */
public class GuessNumberGame {
    public static void main(String[] args) {
        
        Random r = new Random();
        //��������� 1-100
        int guessNumber = r.nextInt(101) + 1;
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("��������Ҫ�µ�����(1-100)");
            int inputNumber = sc.nextInt();
            
            if (inputNumber > guessNumber) {
                System.out.println("���µ�����̫����");
            } else if (inputNumber < guessNumber) {
                System.out.println("���µ�����̫С��");
            } else {
                System.out.println("��ϲ�����¶���");
                break;
            }
        }
    }
}
