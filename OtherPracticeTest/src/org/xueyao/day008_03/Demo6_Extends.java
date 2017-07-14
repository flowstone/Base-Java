package org.xueyao.day008_03;
/**
 * @author Yao Xue
 * @date Jul 14, 2017 6:10:16 PM
 */
public class Demo6_Extends {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println("-----------");
        Son son2 = new Son("小明", 18);
    }
    
}

/*
 * 父类没有无参构造方法，子类 怎么办？
 * super解决
 * this解决
 * 
 * 注意事项
 *      super() 或者this() 必须出现在构造方法的第一条语句上
 * */


class Father {
    private String name;  //姓名
    private int age;      //年龄
    
    public Father() {
        System.out.println("Father 空参构造");
    }

    public Father(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Father 空参构造");

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
    
    
}


class Son extends Father{
    public Son() {
        this("王五", 25);   //本类中的构造方法
        //super("李四",24);   //调用父类中的构造方法
        System.out.println("Son 空参构造");
    }
    
    public Son(String name, int age) {
        System.out.println("Son 有参构造");

    }
}