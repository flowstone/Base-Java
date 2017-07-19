package org.xueyao.work04;
/**
 * 3. 定义歌手类(Singer),继承Person类
    i.  成员方法:
    1.   重写父类的 eat()方法
    a)  输出格式: 30岁的歌手薛之谦在吃大闸蟹
    2.   特有方法: sing()  唱歌
    a)  输出格式:  30岁的歌手薛之谦在演唱丑八怪
    ii. 提供空参和带参构造方法

 * @author Yao Xue
 * @date Jul 19, 2017 8:33:25 PM
 */
public class Singer extends Person{
    
    public Singer() {
        super();
    }

    public Singer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getAge()+"岁的歌手"+getName()+"在吃大闸蟹");
    }
    
    public void sing() {
        System.out.println(getAge()+"岁的歌手"+getName()+"在演唱丑八怪");
    }
    
}
