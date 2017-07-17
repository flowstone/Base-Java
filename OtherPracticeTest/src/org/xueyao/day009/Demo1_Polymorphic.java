package org.xueyao.day009;
/**
 * @author Yao Xue
 * @date Jul 17, 2017 8:30:08 AM
 */
public class Demo1_Polymorphic {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        
        Animal a = new Cat(); //父类引用指向子类对象
    }
}


class Animal {
    public void eat() {
        System.out.println("动物吃饭");
    }
    
}

class Cat extends Animal {
    public void eat() {
        System.out.println("猫吃鱼");
    }
}