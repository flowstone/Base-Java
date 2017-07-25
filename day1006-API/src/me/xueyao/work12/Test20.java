package me.xueyao.work12;

import java.util.Scanner;

/**
 * 模拟验证手机号的过程，按照以下要求实现相关代码（友情提示：不一定要用正则）
    a.  提示用户在控制台输入手机号，用一个字符串对其进行保存
    b.  判断该手机号位数是否是11位
    c.  判断该手机号，是否都是数字
    d.  判断改手机号最后3为数字如果是相同数字则认为是靓号

 * @author Yao Xue
 * @date Jul 25, 2017 9:35:08 PM
 */
public class Test20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号");
        String number = sc.nextLine().trim();
        
        boolean matches = number.matches("[1][34789][0-9]{9}");
        //System.out.println(matches);
        if (matches) {
            String substring = number.substring(8);
            char[] charArray = substring.toCharArray();
            if(charArray[0]==charArray[1] && charArray[1] == charArray[2]) {
                System.out.println("该号码是靓号");
            }
            //System.out.println(substring);
        }
    }
}
