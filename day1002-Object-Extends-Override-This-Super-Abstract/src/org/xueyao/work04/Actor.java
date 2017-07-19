package org.xueyao.work04;
/**
 * 2. 定义演员类(Actor),继承Person类
    i.  成员方法:
    1.  重写父类的 eat()方法
    a)  输出格式:  18岁的演员景甜在吃小龙虾
    2.   特有方法:  跳舞(dance)
    a)  输出格式:  18岁的演员景甜在跳白天鹅.
    ii. 提供空参和带参构造方法

 * @author Yao Xue
 * @date Jul 19, 2017 8:30:55 PM
 */
public class Actor extends Person {
    
    public Actor() {
        super();
    }

    public Actor(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getAge()+"岁的演员"+getName()+"在吃小龙虾");
    }
    
    public void dance() {
        System.out.println(getAge()+"岁的演员"+getName()+"在跳白天鹅");
    }
}
