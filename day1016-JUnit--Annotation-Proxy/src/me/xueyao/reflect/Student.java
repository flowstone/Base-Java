package me.xueyao.reflect;
/**
 * @author Yao Xue
 * @date Aug 7, 2017 6:15:59 PM
 */
public class Student {

    public static void main(String[] args) {

    }
    
    //属性
    private String name;
    private int age;
    
    public String description;

    
    //无参构造方法
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    private Student(String name, int age, String description) {
        super();
        this.name = name;
        this.age = age;
        this.description = description;
    }
    
    private void show(int num) {
        System.out.println("私有方法:"+num);
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", description=" + description + "]";
    }
    
    

}
