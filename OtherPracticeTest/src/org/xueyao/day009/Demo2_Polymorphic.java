package org.xueyao.day009;
/**
 * 成员变量
 * 编译看左边(父类)，运行看左边(父类)
 * 
 * 成员方法
 * 编译看左边(父类)，运行看右边(子类)。 动态绑定
 * 
 * 静态方法
 * 编译看左边(父类)，运行看左边(父类)
 * (静态和类相关，算不上重写，所以，访问还是左边)
 * 只有非静态的成员方法，编译看左边，运行看右边
 * 
 * @author Yao Xue
 * @date Jul 17, 2017 2:20:21 PM
 */
public class Demo2_Polymorphic {
    public static void main(String[] args) {
        Father f = new Son();
        f.print();
        //System.out.println(f.num);
        //f.method();  Father.method();
    }
}

class Father {
    int num = 10;
    public void print() {
        System.out.println("father");
    }
    public static void method() {
        System.out.println("father static method");
    }
}

class Son extends Father {
    int num = 20;
    public void print() {
        System.out.println("son");
    }
    
    public static void method() {
        System.out.println("son static method");
    }
}
