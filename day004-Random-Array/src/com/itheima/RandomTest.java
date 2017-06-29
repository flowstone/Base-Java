package com.itheima;

import java.util.Random;

/**
 * @author Yao Xue
 * @date Jun 29, 2017 9:28:50 AM
 */
public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        
        for (int i = 0; i < 100; i++) {
            //int number = r.nextInt(10);
            // 33-88  88-33=55+1
            //int number = r.nextInt(56)+33;
            
            int number = r.nextInt(100)+1;
            System.out.println(number);
        }
        
        
    }
}
