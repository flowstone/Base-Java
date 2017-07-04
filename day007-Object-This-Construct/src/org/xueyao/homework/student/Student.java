package org.xueyao.homework.student;
/**
 * 学生类Student
        属性:
            姓名name
            年龄age
            成绩score
        行为:
            吃饭eat()
            学习study()
 * @author Yao Xue
 * @date Jul 4, 2017 8:06:00 AM
 */
public class Student {
    private String name;
    private int age;
    private double score;
    
    
    public Student() {
    }


    public Student(String name, int age, double score) {
        super();
        this.name = name;
        this.age = age;
        this.score = score;
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


    public double getScore() {
        return score;
    }


    public void setScore(double score) {
        this.score = score;
    }
    
    public void eat() {
        System.out.println(name+"正在吃饭");
    }
    
    public void study() {
        System.out.println(name+"正在学习");
    }
}
