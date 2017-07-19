package org.xueyao.homework06;
/**
 * 请用代码描述: 18岁的欧阳青青正在洗一件白色的LiNing牌的衣服
 * 匿名对象调用方法
匿名对象作为实际参数
类名作为参数类型
 * @author Yao Xue
 * @date Jul 18, 2017 9:46:23 PM
 */
public class Test9 {
    public static void main(String[] args) {
        new Person("欧阳青青", 18).wash(new Cloth("LiNing", "白色"));
    }
}

/*
 * Person   
 *    成员变量：age,name
 *    成员方法：wash(Cloth c)
 *    
 */
class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    //18岁的欧阳青青正在洗一件白色的LiNing牌的衣服
    public void wash(Cloth c) {
        System.out.println(age+"岁的"+name+"正在洗一件"+c.getColor()+"的"+c.getBrand()+"牌的衣服");
    }
}
/*
 * Cloth
 *      成员变量： color,brand
 */
class Cloth {
    private String brand;
    private String color;
    public Cloth(String brand, String color) {
        super();
        this.brand = brand;
        this.color = color;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
}
