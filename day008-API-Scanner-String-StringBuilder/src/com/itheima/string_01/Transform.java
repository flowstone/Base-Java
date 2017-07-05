package com.itheima.string_01;

import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jul 5, 2017 4:16:41 PM
 */
public class Transform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ÇëÊäÈë×Ö·û´®");
        String s  = sc.nextLine();
        
        String string = s.substring(0, 1).toUpperCase()+s.substring(1).toLowerCase();
        System.out.println(string);
        
        
        System.out.println("------------");
       
    }
}
