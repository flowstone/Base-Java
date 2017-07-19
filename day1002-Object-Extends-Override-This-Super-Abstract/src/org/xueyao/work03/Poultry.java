package org.xueyao.work03;
/**
 * 1. 定义家禽类(Poultry)
    i.  成员变量(私有):  颜色(color),年龄(age)
    ii. 成员方法:  吃饭(void eat())
    1.  输出格式:  2岁的红色家禽在吃饭
    iii.    提供空参和带参构造方法
    iv. 提供setXxx和getXxx方法

 * @author Yao Xue
 * @date Jul 19, 2017 8:17:55 PM
 */
public class Poultry {
    private String color;
    private int age;
    
    
    public Poultry() {
    }


    public Poultry(String color, int age) {
        this.color = color;
        this.age = age;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public void eat() {
        System.out.println(age+"岁的"+color+"家禽在吃饭");
    }
}
