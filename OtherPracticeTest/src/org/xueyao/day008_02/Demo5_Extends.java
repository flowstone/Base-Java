package org.xueyao.day008_02;
/**
 * @author Yao Xue
 * @date Jul 14, 2017 5:59:45 PM
 */
public class Demo5_Extends {
    public static void main(String[] args) {
        Son son = new Son();
    }
}

/*
 * 子类中所有的构造方法默认都会访问父类中空参数的构造方法
 * 因为子类 会继承父类中的数据，可能 还会使用父类的数据 
 * 所以，子类初始化之前 ，一定要先完成父类数据 的初始化
 * 其实：
 *      每一个构造方法的第一条语句默认都是super()　Object类最顶层的父类
 * */
class Father {
    public Father() {
       
        System.out.println("Father 的构造方法");
    }
}

class Son extends Father {
    public Son() {
        super();  //这是一条语句，如果 不写，系统会默认加上，用来访问父类中的空参构造方法
        System.out.println("Son 的构造方法");
    }
}
