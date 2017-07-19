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
        System.out.println(age+"���"+name+"���");
    }
    
    public void run() {
        System.out.println(age+"���"+name+"����");
    }
}

class Dog extends Animal {
    public void protectedHome() {
        System.out.println(age+"���"+name+"����");
    }
}

class Cat extends Animal {
    public void catchMouse() {
        System.out.println(age+"���"+name+"ץ����");
    }
}

class ArrayDog extends Dog {
    public void bombBlockhouse() {
        System.out.println(age+"���"+name+"ը�ﱤ");
    }
}
