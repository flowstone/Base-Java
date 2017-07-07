package org.xueyao.homework;
/**
 * @author Yao Xue
 * @date Jul 6, 2017 2:59:41 PM
 */
public class Student {
    private String name;
    private int  age;
    private int score;
    
    public Student() {
        // TODO Auto-generated constructor stub
    }

    public Student(String name, int age, int score) {
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    public void eat() {
        System.out.println("正在吃饭");
    }
    
    public void study(String content) {
        System.out.println("学习内容"+content);
    }
}
