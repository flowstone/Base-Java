package org.xueyao.work05;
/**
 * 2. 定义狗类(Dog),继承Animal类
    i.  成员方法:
    1.  重写父类的 eat()方法
    a)  输出格式::  4条腿黑色的狗在啃骨头
    2.   特有方法:  看家(lookHome)
    a)  输出格式::  4条腿黑色的狗在看家.
    ii. 提供空参和带参构造方法

 * @author Yao Xue
 * @date Jul 19, 2017 8:40:18 PM
 */
public class Dog extends Animal{
    
    public Dog() {
        super();
    }

    public Dog(String color, int numOfLegs) {
        super(color, numOfLegs);
    }

    @Override
    public void eat() {
        System.out.println(getNumOfLegs()+"条腿"+getColor()+"的狗在啃骨头");
    }
    
    public void lookHome() {
        System.out.println(getNumOfLegs()+"条腿"+getColor()+"的狗在看家");

    }
}
