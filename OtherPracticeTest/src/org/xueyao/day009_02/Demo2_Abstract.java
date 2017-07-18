package org.xueyao.day009_02;
/**
 * @author Yao Xue
 * @date Jul 18, 2017 11:34:14 AM
 */
public class Demo2_Abstract {
    public static void main(String[] args) {
        
    }
}

/*
 * 抽象类的成员特点：
 *      成员变量：既可以是变量，也可以是常量。abstract不能修饰成员变量
 *      构造方法：有
 *          用于子类 访问父类数据的初始化
 *      成员方法：既可以是抽象的，也可以是非抽象的
 * 抽象类的成员方法特性：
 *      抽象方法  强制要求子类做的事情
 *      非抽象方法  子类继承的事情，提高代码复用性。
 */
abstract class Demo {
    int num1 = 10;
    final int num2 = 20;
    
    public Demo(){}
    
    public void print() {
        System.out.println("111");
    }
    
    public abstract void method();
}

class Test extends Demo {

    @Override
    public void method() {
        // TODO Auto-generated method stub
        System.out.println("1111");
    }
    
}