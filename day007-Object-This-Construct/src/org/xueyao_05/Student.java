package org.xueyao_05;
/**
 * 定义一个学生类
        在学生类中定义两个属性:身高和姓名
        定义三个构造方法
        形参分别为:身高,姓名,以及身高和姓名
        定义一个测试类分别使用三个构造方法
 * @author Yao Xue
 * @date Jul 3, 2017 4:08:03 PM
 */
public class Student {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int height;
    
    public Student(int height) {
        this.height = height;
    }
    
    public Student(String name) {
        this.name = name;
    }
    
    public Student(String name, int height) {
        this.name = name;
        this.height = height;
    }
}
