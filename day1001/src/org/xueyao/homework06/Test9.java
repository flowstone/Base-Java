package org.xueyao.homework06;
/**
 * ���ô�������: 18���ŷ����������ϴһ����ɫ��LiNing�Ƶ��·�
 * ����������÷���
����������Ϊʵ�ʲ���
������Ϊ��������
 * @author Yao Xue
 * @date Jul 18, 2017 9:46:23 PM
 */
public class Test9 {
    public static void main(String[] args) {
        new Person("ŷ������", 18).wash(new Cloth("LiNing", "��ɫ"));
    }
}

/*
 * Person   
 *    ��Ա������age,name
 *    ��Ա������wash(Cloth c)
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
    //18���ŷ����������ϴһ����ɫ��LiNing�Ƶ��·�
    public void wash(Cloth c) {
        System.out.println(age+"���"+name+"����ϴһ��"+c.getColor()+"��"+c.getBrand()+"�Ƶ��·�");
    }
}
/*
 * Cloth
 *      ��Ա������ color,brand
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
