package org.xueyao.work05;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 10:04:36 PM
 */
public class Tiger extends Animal{
    
    public Tiger(){}
    public Tiger(String color ,int age) {
        super(color,age);
    }
    @Override
    public void eat() {
        System.out.println(getAge()+"岁的"+getColor()+"老虎吃肉");
    }

}
