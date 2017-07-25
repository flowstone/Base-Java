package me.xueyao.work04;

import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jul 25, 2017 8:12:46 PM
 */
public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String line = sc.nextLine();
        String regex = "[a-zA-Z][a-zA-Z0-9_]{5,11}";
        boolean matches = line.matches(regex);
        if (matches) {
            System.out.println("用户名合法");
        } else {
            System.out.println("用户名不合法");
        }
    }
}
