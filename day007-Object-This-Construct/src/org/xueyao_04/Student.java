package org.xueyao_04;
/**
 * ѧ����
 * @author Yao Xue
 * @date Jul 3, 2017 3:05:00 PM
 */
public class Student {
    //��Ա����
    private String name;
    private int age;
    
    //���췽��
    public Student() {}
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
}
