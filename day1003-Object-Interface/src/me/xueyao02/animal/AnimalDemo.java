package me.xueyao02.animal;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 8:19:14 PM
 */
public class AnimalDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "哈士奇";
        dog.blindGuiding();
        dog.drugDectection();
    }
}
/**
 * 特点
 *  1.接口可以多实现
 *  2.一个类实现多个接口，那么这些接口可以定义相同的常量和方法
 *  3.一个类实现多个接口，这些接口能不能定义相同方法名，但是返回值类型不同的方法？？？
 *      不可以，因为是同名方法，不是重载方法(参数列表 )
 */

interface Guidable {
    public static final int YEARS = 2;
    public abstract void blindGuiding();
}

interface DrugDetectable {
    public static final int YEARS = 3;
    
    public abstract void drugDectection();
    
}

abstract class Animal {
    public String name;
    
    public abstract void shout();
    public abstract void eat();
    
    public void run() {
        
    }
}

/*
 * 接口可以多实现
 */
class Dog extends Animal implements Guidable,DrugDetectable {

    @Override
    public void drugDectection() {
        System.out.println(name+"学会了缉毒");
    }

    @Override
    public void blindGuiding() {
        System.out.println(name+"经过"+Guidable.YEARS+"年训练，学会了导盲！");
        System.out.println(name+"经过"+DrugDetectable.YEARS+"年训练，学会了导盲！");
    }

    @Override
    public void shout() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        
    }
    
}

class Wolf extends Animal implements DrugDetectable {

    @Override
    public void drugDectection() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void shout() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        
    }
    
}
