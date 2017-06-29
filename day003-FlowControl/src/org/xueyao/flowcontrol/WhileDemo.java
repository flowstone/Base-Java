package org.xueyao.flowcontrol;
/*
 * while 循环的语句格式
 *      while (判断条件语句) {
 *          循环体语句;
 *      }
 * 
 *  扩展格式：
 *      初始化语句
 *      while (判断条件语句) {
 *          循环体语句;
 *          控制条件语句;
 *      }
 * 
 */
public class WhileDemo {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 10) {
            System.out.println("HelloWorld");
            x++;
        }
    }
}
