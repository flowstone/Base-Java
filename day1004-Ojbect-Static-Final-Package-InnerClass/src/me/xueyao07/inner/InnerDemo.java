package me.xueyao07.inner;

import me.xueyao07.inner.Outer.Inner;
import me.xueyao07.inner.Outer.StaticInner;

/**
 * @author Yao Xue
 * @date Jul 23, 2017 11:12:47 AM
 */
public class InnerDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        String s = outer.outerField;
        Inner inner = outer.new Inner();
        StaticInner staticInner = new Outer.StaticInner();
        int age = Outer.StaticInner.age;
    }
}

class Outer {
    String outerField;
    Inner inner;
    void outerMethod() {
        inner = new Inner();
        inner.innnerMethod();
        
        System.out.println(outerField);
        
        /**
         * 方法内部类是指在成员方法中定义的类，它只能在当前方法中被使用
         * 其实就是局部变量
         */
        class MethodInner {
            void speak() {
                
            }
        }
        MethodInner m = new MethodInner();
        m.speak();
    }
    
    /**
     * 静态内部类具备如下特点：
     *  1.在静态内部类中只能访问外部类的静态成员。
     *  2.在静态内部类中可以定义静态成员和非静态成员，而在成员内部类中不允许定义静态的成员.
     *  3.在静态内部类的方法中不可以调用外部类的对象方法，但是可以调用外部类的静态方法.
     */
    
    static class StaticInner {
        String id;
        static int age;
    }
    /**
     * 成员内部类特点如下 ：
     *  1.在成员内部类中可以访问外部类的所有成员
     *  2.成员内部类中的方法也可以调用外部类的方法
     *  3.成员内部类中不可以声明静态变量，静态方法，因为成员变量属于对象的，静态与对象无关
     *  4.外部类中可以用内部类声明成员属性，作为外部类的成员，也可以在方法中创建内部类对象，调用内部类的方法
     *
     */
    class Inner {
        void innnerMethod() {
            System.out.println(outerField);
            outerMethod();
        }
    }
}