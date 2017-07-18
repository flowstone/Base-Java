package org.xueyao.day009_03;
/**
 * @author Yao Xue
 * @date Jul 18, 2017 11:56:11 AM
 */
public class Test1_Animal {
    public static void main(String[] args) {
        Cat cat = new Cat("加菲", 8);
        System.out.println(cat.getName()+"..."+cat.getAge());
        cat.eat();
        cat.catchMouse();
        
        Dog dog = new Dog("八公", 30);
        System.out.println(dog.getName()+"..."+dog.getAge());
        dog.eat();
        dog.lookHome();
        
    }
}

/*
 * 案例演示
 *  具体事物： 猫，狗
 *  共性：姓名，年龄，吃饭
 *  猫的特性：抓老鼠
 *  狗的特性：看家
 * */

abstract class Animal {
    private String name;
    private int age;
    
    public Animal(){}

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public abstract void eat();
    
    
}

class Cat extends Animal {
    
    public Cat() {}
   
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("猫吃鱼");
    }
    
    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal {
    
    

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("狗吃肉");
    }
    
    public void lookHome() {
        System.out.println("看家");
    }
}
