package org.xueyao.day009_03;
/**
 * @author Yao Xue
 * @date Jul 18, 2017 1:38:38 PM
 */
public class Test2_Teacher {
    public static void main(String[] args) {
        BaseTeacher bt = new BaseTeacher("小明", 18);
        bt.teach();
    }
}


abstract class Teacher {
    private String name;
    private int age;
    
    public Teacher(){}
    public Teacher(String name, int age) {
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
    
    public abstract void teach();
}

class BaseTeacher extends Teacher {
    
    public BaseTeacher(){}
    
    public BaseTeacher(String name, int age) {
        super(name,age);
    }
    public void teach() {
        System.out.println("我的姓名是："+super.getName()+",我的年龄是"+this.getAge()+",讲的内容是Java基础");
    }
    
}