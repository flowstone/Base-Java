package com.itheima_02;

public class Student {
    private String name;
    private int age;
    
    public Student() {
        System.out.println("-----------");
    }
    /**
     * ����ѧ������
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * ��ȡѧ������
     * @return
     */
    public int getAge() {
        return age;
    }
    
    /**
     * ����ѧ��������
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * ��ȡѧ��������
     * @return
     */
    public String getName() {
        return name;
    }
}
