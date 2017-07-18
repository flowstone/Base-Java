package org.xueyao.day009_02;
/**
 * @author Yao Xue
 * @date Jul 18, 2017 11:15:23 AM
 */
public class Demo1_Abstract {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        Cat cat = new Cat();
        cat.eat();
    }
}

/*
 * 抽象类特点
 *      a:抽象类和抽象方法必须用abstract关键字修饰
 *          abstract class 类名()
 *          public abstract void eat();
 *      b:抽象类不一定有抽象方法，有抽象方法的类一定是抽象类或者是接口
 *      c:抽象类不能实例化那么，抽象类如何实例化呢？
 *          按照多态的方式，由具体的子类实例化。其实这也是多态的一种，抽象类多态
 *      d:抽象类的子类
 *          要么是抽象类
 *          要么重写抽象类中的所有抽象方法
 */

abstract class Animal {    //抽象类
    public abstract void eat();   //抽象方法
}

class Cat extends Animal {

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("猫吃鱼");
    }
    
}
