package org.xueyao04.abstractd;
/**
 * @author Yao Xue
 * @date Jul 20, 2017 2:48:08 PM
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "加菲猫";
        cat.shout();
        
        Dog dog = new Dog();
        dog.name = "灰太狼";
        dog.shout();
    }
}

/*
 * 定义三个动物：猫狗狼
 * 进行共性抽取：动物都有叫的方法
 * 
 * 问题：父类拥有共性，但是无法具体定义?干脆不要定义，没有方法体
 * 
 * 抽象方法：没有方法体的方法，用关键字abstract修饰
 * 1.拥有抽象方法的类必须是抽象类
 * 2.抽象类不能实例化
 * 3.普通类继承抽象类，必须重写全部的抽象方法
 * 4.如果继承抽象类，但是有抽象方法没有重写，此类必须 是抽象类
 * 5.作用：对某一类事物进行定义
 * 
 * */

abstract class Animal {
    String name;
    public abstract void shout();
}
 
class Cat extends Animal {

    @Override
    public void shout() {
        System.out.println(name + "喵喵的叫");
    }
    
}

class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println(name + "汪汪的叫");
    }
}
