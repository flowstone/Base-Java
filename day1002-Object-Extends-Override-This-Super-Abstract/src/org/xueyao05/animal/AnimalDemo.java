package org.xueyao05.animal;
/**
 * @author Yao Xue
 * @date Jul 20, 2017 2:57:50 PM
 */
public class AnimalDemo {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.name = "灰太狼";
        wolf.eat();
        wolf.shout();
        
        Dog dog = new Dog();
        dog.name = "哈士奇";
        dog.eat();
        dog.shout();
        
        
        Bird.fly();
    }
}

abstract class Bird {
    static void fly() {
        System.out.println("小鸟会飞");
    }
}

//定义动物：eat、shout方法
abstract class Animal {
    String name;
    public Animal() {
        System.out.println("抽象类中的构造方法");
    }
    abstract void eat();
    abstract void shout();
}

class Wolf extends Animal {
    @Override
    void eat() {
        System.out.println(name + "说：跟我混，有肉吃！");
    }
    @Override
    void shout() {
        System.out.println(name + "在嗷嗷叫!");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println(name + "说：我喜欢吃肉");
    }
    @Override
    void shout() {
        System.out.println(name + "在汪汪的叫");
    }
}