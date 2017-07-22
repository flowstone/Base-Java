package org.xueyao.work02;
/**
 * 验证：final修饰的变量称为常量，这些变量只能赋值一次
 * @author Yao Xue
 * @date Jul 22, 2017 8:33:50 PM
 */
public class Final_3 {
    public static void main(String[] args) {
        final int a = 10;
        //final修饰的变量称为常量，这此变量只能赋值一次
        //a = 20;
        
        final int b;
        b = 5;
        //final修饰的变量称为常量，这些变量只能赋值一次
        //b = 15;
    }
}
