package org.xueyao08.throwd;
/**
 * 6. 异常关键字throw和throws的用法
        1. throw : 在方法中,手动抛出异常。语法：throw new 异常类（）
        2. throws: 方法声明上使用,标识出方法内部会有异常,让调用者去处理
        3. 案例：买烟
            1. 定义一个Person，有一个买烟的方法，参数是int类型money
            2. 该方法内部判断，当money不够时，抛出异常，让调用者处理
        4. throw在开发中的应用：方法设计者不希望该方法被非法调用，如果非法使用throw抛异常给予警告(return更严厉)
        5. throws声明 和 try..catch捕获
            1. throws不处理异常，抛给方法调用者，最终到main方法时，给JVM处理
            2. try..catch是自己处理
 * @author Yao Xue
 * @date Jul 24, 2017 3:13:40 PM
 */
public class ThrowDemo {
    public static void main(String[] args) throws Exception{
        Person p = new Person();
        try {
            p.buyZhongHua(11);
        } catch (Exception e) {
            // TODO: handle exception
            //打印栈中追溯：打印异常信息(给程序员看)
            e.printStackTrace();
            System.out.println("钱不够");
        }
        System.out.println("程序继续运行");
        p.buyZhongHua(10);
        System.out.println("程序如果有异常，就中止");
    }
}


class Person {
    //throws：在方法上声明，表明方法内部有异常
    void buyZhongHua(int money) throws Exception {
        if (money < 100) {
//            System.out.println("买个毛线");
//            return;
            //学习JVM的方式，抛出一个异常
            Exception e = new Exception("买个毛线");
            //抛出一个异常
            throw new Exception("买个毛线");
        } else {
            System.out.println("大哥，你的烟");
        }
    }
}