package org.xueyao.day008_04;
/**
 * @author Yao Xue
 * @date Jul 14, 2017 7:11:59 PM
 */
public class Demo7_Extends {
    public static void main(String[] args) {
        Son son = new Son();
        son.print();
        son.method();
    }
}

/*
 * 不同名的方法 
 * 同名的方法
 */

class Father {
    public void print() {
        System.out.println(" Fu print");
    }
}

class Son extends Father {
    public void method() {
        System.out.println("Zi method");
    }
    public void print() {
        super.print(); //super可以调用父类的成员方法
        System.out.println("zi print");
    }
}