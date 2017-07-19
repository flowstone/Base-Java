package org.xueyao.homework08;
/**
 * 请使用代码描述
    18岁的服务员景甜,会说话,上菜
    30岁的厨师秦俊杰,会说话,炒菜
        要求: 把服务员类和厨师类的共性抽取到员工类中
 * @author Yao Xue
 * @date Jul 18, 2017 10:00:07 PM
 */
public class Test11 {
    public static void main(String[] args) {
        Waiter waiter = new Waiter("景甜", 18);
        Cook cook = new Cook("秦俊杰", 30);
        System.out.println(waiter.getAge()+"岁的服务员"+waiter.getName());
        waiter.work();
        cook.work();
    }
}

class Employee {
    private String name;
    private int age;
    
    
    public Employee(String name, int age) {
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


    public void say() {
        System.out.println("会说话");
    }
}
class Waiter extends Employee {

    public Waiter(String name, int age) {
        super(name, age);
        // TODO Auto-generated constructor stub
    }
    
    public void work() {
        //18岁的服务员景甜,会说话,上菜
       
        System.out.println("上菜");
    }
}

class Cook extends Employee {

    public Cook(String name, int age) {
        super(name, age);
        // TODO Auto-generated constructor stub
    }
    // 30岁的厨师秦俊杰,会说话,炒菜
    public void work() {
        System.out.println("炒菜");
    }
}
