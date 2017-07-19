package org.xueyao.work02;
/**
 * 1. 定义Person类
    i.  成员变量(私有):  名称(name),年龄(age)
    ii. 成员方法:  吃饭(void eat())
    1.  输出格式:  30岁的王小平在吃饭
    iii.    提供空参和带参构造方法
    iv. 提供setXxx和getXxx方法

 * @author Yao Xue
 * @date Jul 19, 2017 7:58:54 PM
 */
public class Person {
    private String name;
    private int age;
    
    public Person(){}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public void eat() {
        System.out.println(age+"岁的"+name+"在吃饭");
    }
}
