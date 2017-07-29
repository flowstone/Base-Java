package org.xueyao.map;
/**
 * @author Yao Xue
 * @date Jul 29, 2017 10:19:32 AM
 */
public class Student {
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
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
    
    
}
