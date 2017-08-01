package org.xueyao.io.task;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 在d盘目录下有一个加密文件a.txt（文件里只有英文和数字），密码是“heima”
当密码输入正确时才能读取文件里的数据。现要求用代码来模拟读取文件的过程，并统计文件里各个字母出现的次数，并把统计结果按照如下格式输出到d盘的count.txt中。
a：2个
b：3个
c：4个

 * @author Yao Xue
 * @date Aug 2, 2017 1:43:08 AM
 */
public class Task01_19 {
    public static void main(String[] args) {
        login();
    }

    private static void login() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("请输入文件密码");
        String password = sc.nextLine().trim();
        if (!"heima".equals(password)) {
            return ;
        }
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
       
        
    }
}
