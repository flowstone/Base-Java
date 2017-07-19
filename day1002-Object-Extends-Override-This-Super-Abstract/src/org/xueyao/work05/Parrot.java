package org.xueyao.work05;
/**
 * 3. 定义鹦鹉类(Parrot),继承Animal类
    i.  成员方法:
    1.   重写父类的 eat()方法
    a)  输出格式:: 2条腿的绿色鹦鹉在吃小米
    2.   特有方法: say()  说明
    a)  输出格式::  2条腿的绿色鹦鹉在说你好,丑八怪
    ii. 提供空参和带参构造方法

 * @author Yao Xue
 * @date Jul 19, 2017 8:42:28 PM
 */
public class Parrot extends Animal{
    
    
    public Parrot() {
        super();
    }

    public Parrot(String color, int numOfLegs) {
        super(color, numOfLegs);
    }

    @Override
    public void eat() {
        System.out.println(getNumOfLegs()+"条腿的"+getColor()+"鹦鹉在吃小米");
    }
    
    public void say() {
        System.out.println(getNumOfLegs()+"条腿的"+getColor()+"鹦鹉在说你好,丑八怪");

    }
}
