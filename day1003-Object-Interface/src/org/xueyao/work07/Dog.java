package org.xueyao.work07;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 8:19:27 AM
 */
public class Dog extends Animal{
    public Dog(){}
    public Dog(String color, int age) {
        super(color, age);
    }
    @Override
    public void eat() {
        System.out.println(getAge()+"岁"+getColor()+"的狗喜欢啃骨头");
    }
    
    public void lookHome() {
        System.out.println(getAge()+"岁"+getColor()+"的狗喜欢看家");
    }
}
