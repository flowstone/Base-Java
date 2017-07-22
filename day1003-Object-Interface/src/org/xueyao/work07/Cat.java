package org.xueyao.work07;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 8:14:43 AM
 */
public class Cat extends Animal{
    
    public Cat(){}
    public Cat(String color, int age) {
        super(color,age);
    }
    @Override
    public void eat() {
        System.out.println(getAge()+"岁"+getColor()+"的猫喜欢吃鱼");
    }
    
    public void catchMouse() {
        System.out.println(getAge()+"岁"+getColor()+"的猫喜欢抓老鼠");
    }
}
