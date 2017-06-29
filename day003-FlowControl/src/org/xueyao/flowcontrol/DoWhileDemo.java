package org.xueyao.flowcontrol;
/*
 * do...while循环格式：
 * 
 *      do {
 *          循环体语句;
 *      } while (判断条件语句);
 *  扩展格式：
 *      初始化语句;
 *      do {
 *          循环体语句;
 *          控制条件语句;
 *      } while (判断条件语句);
 */
public class DoWhileDemo {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("HelloWorld");
            i++;
        } while (i <= 10);
    }
}
