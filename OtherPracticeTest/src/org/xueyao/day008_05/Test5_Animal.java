package org.xueyao.day008_05;
/**
 * @author Yao Xue
 * @date Jul 14, 2017 7:52:24 PM
 */
public class Test5_Animal {
    public static void main(String[] args) {
        Cat cat = new Cat("��", 4);
        System.out.println(cat.getColor()+"----"+cat.getLeg());
        cat.eat();
        cat.catchMouse();
    }
}

class Animal {
    private String color;
    private int leg;  //�ȵĸ���
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
        System.out.println("�Է�");
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
        System.out.println("è����");
    }
    
    public void catchMouse() {
        System.out.println("ץ����");
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
        System.out.println("������");
    }
    
    public void lookHome() {
        System.out.println("����");
    }
}