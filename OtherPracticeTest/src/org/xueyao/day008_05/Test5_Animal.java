package org.xueyao.day008_05;
/**
 * @author Yao Xue
 * @date Jul 14, 2017 7:52:24 PM
 */
public class Test5_Animal {
    public static void main(String[] args) {
        Cat cat = new Cat("花", 4);
        System.out.println(cat.getColor()+"----"+cat.getLeg());
        cat.eat();
        cat.catchMouse();
    }
}

class Animal {
    private String color;
    private int leg;  //腿的个数
    public Animal() {
    }
    public Animal(String color, int leg) {
        this.color = color;
        this.leg = leg;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getLeg() {
        return leg;
    }
    public void setLeg(int leg) {
        this.leg = leg;
    }
    
    public void eat() {
        System.out.println("吃饭");
    }
    
    
}


class Cat extends Animal {

    public Cat() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Cat(String color, int leg) {
        super(color,leg);
    }
    
    public void eat() {
        System.out.println("猫吃鱼");
    }
    
    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal {

    public Dog() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Dog(String color, int leg) {
        super(color,leg);
    }
    
    public void eat() {
        System.out.println("狗吃肉");
    }
    
    public void lookHome() {
        System.out.println("看家");
    }
}