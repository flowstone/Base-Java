package org.xueyao.flowcontrol;

/*
 * if语句有有一种格式
 * 
 * if语句格式1：
 *      if (关系表达式) {
 *          语句体;
 *      }     
 */
public class IfDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        
        //定义两个变量
        int a = 10;
        int b = 20;
        
        if (a == b) {
            System.out.println("a等于b");
        }
        
        int c = 10;
        
        if (a == c) {
            System.out.println("a等于c");
        }
        
        System.out.println("结束");
    }
}
