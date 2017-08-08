package org.xueyao03.finald;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 10:50:45 AM
 */
public class Demo {
    public static void main(String[] args) {
        //Dog d = new Dog();
        //d.decleration();
        new Fox().decleration();
    }
}

class Animal {
    public void decleration() {
        System.out.println("动物类的联合声明:我们是人类的好朋友");
    }
}

class Dog extends Animal {
    
}

class Fox extends Animal {
    @Override
    public void decleration() {
        System.out.println("动物类的联合声明：我们是人类的天敌");
    }
}