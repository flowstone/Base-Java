package org.xueyao.homework;
/**
 * 猫、狗类测试类
 * @author Yao Xue
 * @date Jul 4, 2017 7:59:09 AM
 */
public class CatDogTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setBreed("波斯猫");
        cat.setColor("花色");
        cat.eat();
        cat.catchMouse();
        
        Dog dog = new Dog();
        dog.setBreed("藏獒");
        dog.setColor("黑色");
        dog.eat();
        dog.lookHome();
        
        System.out.println("-------------");
        
        Cat cat2 = new Cat("波斯猫","花色");
        cat2.eat();
        cat2.catchMouse();
        
        Dog dog2 = new Dog("藏獒","黑色");
        dog2.eat();
        dog2.lookHome();
    }
}
