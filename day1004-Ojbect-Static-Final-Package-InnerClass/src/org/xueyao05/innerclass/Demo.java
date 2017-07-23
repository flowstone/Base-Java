package org.xueyao05.innerclass;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 11:23:36 AM
 */
public class Demo {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.introduct();
    }
}

/**
 * 成员内部类：
 *  1.成员内部类可以访问外部类的所有成员.
 *  2.成员内部类的方法也可以调用外部类的方法
 *  3.成员内部类不可以声明静态变量，静态方法.因为成员变量是属于对象，静态与对象无关
 *  4.外部类可以用内部类声明成员属性，作为外部类的成员，也可以在方法中创建内部内对象，调用内部类的方法
 */

class Outer {
    private String name = "外部类的name属性";
    //声明一个内部类型的成员属性
    private Inner inner;
    
    
    //定义了一个内部类，在成员属性的位置上
    class Inner {
        //属性
        //在成员内部中不能定义静态属性和方法
        //private static String schoolName;
        //public static void show2(){}
        
        public void show() {
            System.out.println("我是成员内部类的show方法");
            System.out.println("在内部类中访问外部 类的成员属性："+name);
        }
    }
    
    public void introduct() {
        System.out.println("大家好，我是外部类的introduce()方法");
        //创建内部类对象，并调用内部类的方法
        Inner in = new Inner();
        in.show();
    }
}
