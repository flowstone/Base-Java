package org.xueyao09.exceptiontype;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 7. 异常的分类
        1. 编译异常:（必须处理）
            1. 调用了一个抛出异常的方法,调用者不处理,编译失败
            2. 应用：IO异常
        2. 运行异常:（设计者不希望我们处理,后面代码往往就失去了意义）
            1. 方法中,抛出的异常是RuntimeException类,或者是他的子类叫做运行异常
            2. 方法中,抛出的是运行时异常,方法的声明上,不需要使用throws标识，调用者也不需要处理这个异常
            3. 应用：调用者传递参数,传入不合法的数据导致后面所有的计算,没有必要执行了，那么该方法就会抛出运行异常。运行时期异常不能处理,一旦发生,必须停下程序,修改源代码
        3. 案例：写一个计算正方形面积的方法，并比较两个不同边长的正方形的大小
 * @author Yao Xue
 * @date Jul 24, 2017 3:26:59 PM
 */
public class ExceptionTypeDemo {
    public static void main(String[] args) {
        //method();
        /**
         * 运行异常：RuntimeException 及其子类
         * 设计者希望后面的代码不要执行，因为失去意义
         */
        //java.lang.NullPointerException  空指针异常
//        String s = null;
//        System.out.println(s.length());
        
        //java.lang.ArrayIndexOutOfBoundsException  数组越界异常
       /* int[] array = new int[0];
        System.out.println(array[1]);*/
        //java.lang.ArithmeticException  算术异常
        //int i = 1/0;
        
        /**
         * 编译时期异常：IO异常
         */
        try {
            new FileReader("a.txt");
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    private static void method() {
        // TODO Auto-generated method stub
        //当连长为负数，后面的比较失去了意义
        //当参数不合法，后面的执行没必要，你就不要运行，直接崩溃
        int a = -7;
        int b = 6;
        int area1 = getArea(a);
        int area2 = getArea(b);
        if (area1 >= area2) {
            System.out.println("a的面积比较大");
        } else {
            System.out.println("b的面积比较大");
        }
    }
    //计算正方形面积的方法
    private static int getArea(int i) {
        // TODO Auto-generated method stub
        if (i <= 0) {
            throw new RuntimeException("边长不能为负");
        }
        return i*i;
    }
}
