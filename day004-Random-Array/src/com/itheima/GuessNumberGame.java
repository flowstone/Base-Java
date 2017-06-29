package com.itheima;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * 猜数字游戏
 * 
 * @author Yao Xue
 * @date Jun 29, 2017 9:47:18 AM
 */
public class GuessNumberGame {
    public static void main(String[] args) {
        
        Random r = new Random();
        //生成随机数 1-100
        int guessNumber = r.nextInt(101) + 1;
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("请输入您要猜的数字(1-100)");
            int inputNumber = sc.nextInt();
            
            if (inputNumber > guessNumber) {
                System.out.println("您猜的数字太大了");
            } else if (inputNumber < guessNumber) {
                System.out.println("您猜的数字太小了");
            } else {
                System.out.println("恭喜您，猜对了");
                break;
            }
        }
    }
}
