package org.xueyao.homework;
/**
 * 1.老师类Teacher
        属性:
            姓名name
            年龄age
            讲课内容content
        行为:
            吃饭
            讲课
 * @author Yao Xue
 * @date Jul 3, 2017 5:17:00 PM
 */
public class Teacher {
    private String name;
    private int age;
    private String content;
    
    public Teacher() {}
    public Teacher(String name, int age, String content) {
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
        System.out.println("年龄为"+age+"的"+name+"老师正在吃饭....");
    }
    
    public void lesson() {
        System.out.println("年龄为"+age+"的"+name+"老师正在亢奋的讲着"+content+"的知识........");
    }
    
}
