package org.xueyao.day008_04;
/**
 * @author Yao Xue
 * @date Jul 14, 2017 7:29:46 PM
 */
public class Test3_Person {
    public static void main(String[] args) {
        
    }
}

/*
 * ʹ�ü̳�ǰ��ѧ������ʦ����
 *  ���ԣ� ����������
 *  ��Ϊ���Է�
 *  ��ʦ���еķ���������
 *  ѧ�����еķ�����ѧϰ
 * */

class Student {
    private String name;
    private int age;
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Student(String name, int age) {
        super();
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
        System.out.println("ѧ���Է�");
    }
    
    public void study() {
        System.out.println("ѧ��ѧϰ");
    }
}

class Teacher {
    private String name;
    private int age;
    public Teacher() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Teacher(String name, int age) {
        super();
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
        System.out.println("��ʦ�Է�");
    }
    
    public void teach() {
        System.out.println("��ʦ����");
    }
}
