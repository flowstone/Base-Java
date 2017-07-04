package org.xueyao.homework;
/**
 * 学生类Student
        属性:
            姓名name
            年龄age
            学习内容content
        行为:
            吃饭eat()
            学习study()
 * @author Yao Xue
 * @date Jul 3, 2017 5:27:16 PM
 */
public class Student {
    private String name;
    private int age;
    private String content;
    
    public Student() {}
    public Student(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }
    
    public void eat() {
        System.out.println("年龄为"+age+"的"+name+"同学正在吃饭....  ");
    }
    
    public void study() {
        System.out.println("年龄为"+age+"的"+name+"同学正在专心致志的听着"+content+"的知识....");
    }
}
