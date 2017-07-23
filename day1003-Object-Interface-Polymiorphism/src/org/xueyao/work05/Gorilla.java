package org.xueyao.work05;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 10:10:19 PM
 */
public class Gorilla extends Animal{

    public Gorilla(){}
    public Gorilla(String color, int age) {
        super(color,age);
    }
    @Override
    public void eat() {
        System.out.println(getAge()+"岁的"+getColor()+"大猩猩吃香蕉");    
    }

}
