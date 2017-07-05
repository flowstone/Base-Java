package com.itheima.string_01;

import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jul 5, 2017 2:56:14 PM
 */
public class SimulationLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String userName = "admin";
        String passWord = "admin";
        
        for (int i = 2; i >= 0; i--) {
            System.out.println("请输入你的用户名：");
            String name = sc.nextLine().trim();
            System.out.println("请输入你的密码：");
            String pass = sc.nextLine().trim();
            
            if (name.equals(userName) && pass.equals(passWord)) {
                System.out.println("登录成功");
                break;
            } else {
                if (i==0) {
                    System.out.println("您的帐号被锁定，请联系管理员");
                } else {
                    System.out.println("你的用户名或密码错误，还有"+i+"次机会");
                }
            }
        }
    }
}
