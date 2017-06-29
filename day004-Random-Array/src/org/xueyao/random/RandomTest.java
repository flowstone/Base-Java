package org.xueyao.random;

import java.util.Random;
import java.util.Scanner;

/*
 * 猜数字小游戏案例
 * 系统产生一个1-100之间的随机数,请猜出这个数据 是多少
 */
public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        
        int randomNumber = r.nextInt(101)+1;
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("请输入您要猜的数字(1-100之间)");
            int number = sc.nextInt(); 
            if (randomNumber > number) {
                System.out.println("您输入的数字太小了");
            } else if (randomNumber < number) {
                System.out.println("您输入的数字太大了");
            } else {
                System.out.println("恭喜您！猜对了,获得奖品一根辣条");
                break;
            }
        }
    }
}
