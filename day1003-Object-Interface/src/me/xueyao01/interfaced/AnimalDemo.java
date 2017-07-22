package me.xueyao01.interfaced;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 8:00:19 PM
 */
public class AnimalDemo {
    public static void main(String[] args) {
       // Guidable g = new Guidable();  不能实例化接口
    }
}


//定义一个抽象类：动物  eat shout run 共性抽取
/*
 *需求：猫跟狗学会了导盲功能，但是狼学不会
 *解决：
 *      接口：interface
 * 1.接口中的方法默认用public abstract修饰
 * 2.接口中的属性默认用public static final修饰 (用大写表示)
 * 3.接口中属性都是常量，接口中的方法都是抽象方法
 * 4.接口不可以实例化
 *  接口不在java类的继承体系中
 *  
 *  接口的实现
 *      1.关键字 implements
 *      2.实现接口，拥有接口中的所有属性和方法
 *      
 * 
 */

interface Guidable {
    //默认用public static final 修饰
    //static  可以直接用类名调用/接口
    //final  这个属性是常量，一次赋值，终身不变
    public static final int YEARS = 3;
    //默认用public abstract
    public abstract void blindGuiding();
}

abstract class Animal {
    public String name;
    
    public abstract void eat();
    public abstract void shout();
    
    public void run() {
        System.out.println(name+"正在狂奔");
    }
}

class Cat extends Animal implements Guidable {

    @Override
    public void blindGuiding() {
        System.out.println(name+"经过"+YEARS+"年的训练，学会了导盲");
        //System.out.println(name+"经过"+Guidable.YEARS+"年的训练，学会了导盲");
    }

    @Override
    public void eat() {
        
    }

    @Override
    public void shout() {
        
    }
    
}

class Wolf extends Animal {
    private int id;
    protected int num;
    @Override
    public void eat() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void shout() {
        // TODO Auto-generated method stub
        
    }
    
    
}

class Dog extends Animal {

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void shout() {
        // TODO Auto-generated method stub
        
    }
    
}




 