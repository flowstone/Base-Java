package org.xueyao.string;

import java.util.Scanner;

/**
 * 模拟登录,给三次机会,并提示还有几次
 * @author Yao Xue
 * @date Jul 5, 2017 1:01:46 PM
 */
public class SimulationLogin {
    public static void main(String[] args) {
        String username = "admin";
        String password = "123456";
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入你的用户名：");
            String inputUsername = sc.nextLine();
            System.out.println("请输入你的密码：");
            String inputPassword = sc.nextLine();
            
            if (username.equals(inputUsername) && password.equals(inputPassword)) {
                System.out.println("登录成功!");
                break;
            } else {
                if (i == 2) {
                    System.out.println("您的帐号已被锁定，请与管理员联系");
                } else {
                    System.out.println("您还有"+(2-i)+"次机会");
                }
            }
        }
       
    }
}
