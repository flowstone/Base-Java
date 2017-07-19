package org.xueyao.work03;
/**
 * 3. 定义鸭子类(Duck),继承Poultry类
    i.  成员方法:
    1.   重写父类的 eat()方法
    a)  输出格式: 1岁的黑色的鸭子在吃鱼
    2.   特有方法: swim()  游泳方法
    a)  输出格式:  1岁的黑色的鸭子在游泳
    ii. 提供空参和带参构造方法

 * @author Yao Xue
 * @date Jul 19, 2017 8:22:45 PM
 */
public class Duck extends Poultry{
    
    
    public Duck() {
        super();
    }

    public Duck(String color, int age) {
        super(color, age);
    }

    @Override
    public void eat() {
        System.out.println(getAge()+"岁的"+getColor()+"的鸭子在吃鱼");
    }
    
    public void swim() {
        System.out.println(getAge()+"岁的"+getColor()+"的鸭子在游泳");
    }
}
