package org.xueyao.homework;
/**
 * ѧ����Student
        ����:
            ����name
            ����age
            ѧϰ����content
        ��Ϊ:
            �Է�eat()
            ѧϰstudy()
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
        System.out.println("����Ϊ"+age+"��"+name+"ͬѧ���ڳԷ�....  ");
    }
    
    public void study() {
        System.out.println("����Ϊ"+age+"��"+name+"ͬѧ����ר����־������"+content+"��֪ʶ....");
    }
}
