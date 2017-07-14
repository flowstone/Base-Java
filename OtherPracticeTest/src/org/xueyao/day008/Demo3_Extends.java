package org.xueyao.day008;
/**
 * @author Yao Xue
 * @date Jul 14, 2017 5:28:31 PM
 */
public class Demo3_Extends {
    public static void main(String[] args) {
        Son son = new Son();
        son.show();
    }
}
/**
 * 继承的注意事项
 *   子类只能继承父类所有非私有的成员(成员方法和成员变量)
 *   子类不能继承父类的构造方法，但是可以通过super()，关键字去访问父类构造方法
 *   不要为了部分功能而去继承
 * */

class Father {
    public void show() {
        System.out.println("Hello World");
    }
}

class Son extends Father {
    
}
