package org.xueyao01.task;
/**
 * @author Yao Xue
 * @date Jul 24, 2017 1:37:28 PM
 */
public class TaskDemo {
    //static int i;
    //static int i = 5;
    static {
        i = 3;
   //     System.out.println(i);//编译器查找顺序从上往下(属性的声明在这之前，只能赋值，无法访问)
        method();
    }
    //后定义的属性
    static int i= 5;
    static void method() {
        System.out.println(i);
    }
    public static void main(String[] args) {
        System.out.println(i);
    }
}
