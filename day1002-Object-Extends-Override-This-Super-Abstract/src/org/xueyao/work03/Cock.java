package org.xueyao.work03;
/**
 * 2. 定义公鸡类(Cock),继承Poultry类
    i.  成员方法:
    1.   重写父类的 eat()方法
    a)  输出格式::  2岁的红色公鸡在啄米
    2.   特有方法:  打鸣(crow)
    a)  输出格式::  2岁的红色公鸡在打鸣
    ii. 提供空参和带参构造方法

 * @author Yao Xue
 * @date Jul 19, 2017 8:20:21 PM
 */
public class Cock extends Poultry {
    
    public Cock() {
        super();
    }

    public Cock(String color, int age) {
        super(color, age);
    }

    @Override
    public void eat() {
        System.out.println(getAge()+"岁的"+getColor()+"公鸡在啄米");
    }
    
    public void crow() {
        System.out.println(getAge()+"岁的"+getColor()+"公鸡在打鸣");

    }
}
