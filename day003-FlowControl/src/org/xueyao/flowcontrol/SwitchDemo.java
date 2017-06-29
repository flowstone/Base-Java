package org.xueyao.flowcontrol;

import java.util.Scanner;

/*
 * switch语句格式：
 *      switch (表达式) {
 *          case 值1:
 *              语句1;
 *              break;
 *          case 值2:
 *              语句2;
 *              break;
 *          ...
 *          default:
 *              语句n+1;
 *              break;
 *      }
 *      
 *    格式解释：
 *      表达式： byte,short,int ,char
 *          JDK5以后可以是枚举
 *          JDK7以后可以是字符串  
 */
public class SwitchDemo {
    public static void main(String[] args) {
        //键盘录入1，2…..7的数值，使用switch语句判断输出对应的星期一，星期二…..星期日
        
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1-7以内的数");
        int weekday = sc.nextInt();
        
        switch (weekday) {
        case 1:
            System.out.println("星期一");
            break;
        case 2:
            System.out.println("星期二");
            break;
        case 3:
            System.out.println("星期三");
            break;
        case 4:
            System.out.println("星期四");
            break;
        case 5:
            System.out.println("星期五");
            break;
        case 6:
            System.out.println("星期六");
            break;
        case 7:
            System.out.println("星期日");
            break;
        default:
            System.out.println("输入非法数据");
            break;
        }
    }
}
