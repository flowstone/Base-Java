package org.xueyao.work05;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 10:14:38 PM
 */
public class Parrot extends Animal{

    public Parrot(){}
    public Parrot(String color, int age) {
        super(color,age);
    }
    @Override
    public void eat() {
        System.out.println(getAge()+"岁的"+getColor()+"鹦鹉在吃小米");
    }
    
    public void say() {
        System.out.println(getAge()+"岁的"+getColor()+"鹦鹉在说你好");
    }
}
