package org.xueyao05.extend;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 9:16:24 AM
 */
public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Tom";
        dog.age = 3;
        dog.eat();
        dog.run();
        
        Cat cat = new Cat();
        cat.name = "John";
        cat.age = 4;
        cat.catchMouse();
    }
}

class Animal {
     String name;
     int age;
    

    public void eat() {
        System.out.println(age+"岁的"+name+"会吃");
    }
    
    public void run() {
        System.out.println(age+"岁的"+name+"会跑");
    }
}

class Dog extends Animal {
    public void protectedHome() {
        System.out.println(age+"岁的"+name+"看家");
    }
}

class Cat extends Animal {
    public void catchMouse() {
        System.out.println(age+"岁的"+name+"抓老鼠");
    }
}

class ArrayDog extends Dog {
    public void bombBlockhouse() {
        System.out.println(age+"岁的"+name+"炸碉堡");
    }
}
