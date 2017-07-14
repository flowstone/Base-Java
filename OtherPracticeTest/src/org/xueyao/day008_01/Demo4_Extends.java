package org.xueyao.day008_01;
/**
 * @author Yao Xue
 * @date Jul 14, 2017 5:42:40 PM
 */
public class Demo4_Extends {
    public static void main(String[] args) {
        Son son = new Son();
        son.print();
    }
}


/**
 * 案例演示
 *      不同名的变量
 *      同名的变量 
 *        子父类出现同名的变量只是在讲课中举例子有，在开发中是不会出现这种情况
 *        子类继承父类就是为了使用父类，那么如果定义了同名的成员变量没有意义了
 */

class Father {
    int num1 = 10;
    int num2 = 30;
    
}

class Son extends Father {
    int num2 = 20;
    
    public void print() {
        System.out.println(this.num1);
        System.out.println(num2); //就近原则，子类有就不用父类
        System.out.println(super.num2); 
    }
}


