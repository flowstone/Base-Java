package org.xueyao.homework;
/**
 * @author Yao Xue
 * @date Jul 18, 2017 8:20:55 PM
 */
public class Test01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("�ӷ�è");
        cat.setAge(2);
        cat.setColor("��ɫ");
        cat.catchMouse();
    }
}

class Cat {
    private String name;
    private String color;
    private int age;
    public Cat() {
        // TODO Auto-generated constructor stub
    }
    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    
    public void catchMouse() {
        System.out.println(age+"���"+color+name+",��ץ����");
    }
    
}
