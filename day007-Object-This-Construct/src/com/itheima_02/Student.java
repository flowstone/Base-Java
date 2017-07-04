package com.itheima_02;

public class Student {
    private String name;
    private int age;
    
    public Student() {
        System.out.println("-----------");
    }
    /**
     * 设置学生年龄
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * 获取学生年龄
     * @return
     */
    public int getAge() {
        return age;
    }
    
    /**
     * 设置学生的名字
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 获取学生的姓名
     * @return
     */
    public String getName() {
        return name;
    }
}
