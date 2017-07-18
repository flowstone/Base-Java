package org.xueyao.day009_01;
/**
 * @author Yao Xue
 * @date Jul 18, 2017 10:37:24 AM
 */
public class Demo4_Animal {
    public static void main(String[] args) {
        //Cat cat = new Cat();
        //cat.eat();
        method(new Cat());
        method(new Dog());
        
        //开发的时候很少在创建对象的时候用父类引用 指向子类对象，直接创建子类对象更方便，可以使用子类中特有属性和行为
        Animal a = new Dog(); 
    }
    
   /* public static void method(Cat c) {
        c.eat();
    }
    
    public static void method(Dog d) {
        d.eat();
    }*/
    
    //如果把狗强转成猫就会出现类型转换异常，ClassCastException
    public static void method(Animal a) { //当作参数的时候用多态最好，因为扩展性强
        //a.eat();
        //关键字 instanceof 判断前边的引用是否是后边的数据类型
        if (a instanceof Cat) {
            Cat cat = (Cat) a;
            cat.eat();
            cat.catchMouse();
        } else if (a instanceof Dog) {
            Dog dog = (Dog) a;
            dog.eat();
            dog.lookHome();
        } else {
            a.eat();
        }
    }
}
/*
 * A：多态的好处
 *      a:提高了代码的维护性(继承保证)
 *      b:提高了代码的扩展性(由多态保证)
 * B：案例演示
 *      多态的好处
 *      可以当作形式参数，可以接收任意子类对象
 * C:多态的弊端
 *      不能使用子类 的特有属性和行为。     
 */

class Animal {
    public void eat() {
        System.out.println("动物吃饭");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("猫吃鱼");
    }
    
    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("狗吃肉");
    }
    
    public void lookHome() {
        System.out.println("狗看家");
    }
}