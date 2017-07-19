package org.xueyao.homework08;
/**
 * ��ʹ�ô�������
    18��ķ���Ա����,��˵��,�ϲ�
    30��ĳ�ʦ�ؿ���,��˵��,����
        Ҫ��: �ѷ���Ա��ͳ�ʦ��Ĺ��Գ�ȡ��Ա������
 * @author Yao Xue
 * @date Jul 18, 2017 10:00:07 PM
 */
public class Test11 {
    public static void main(String[] args) {
        Waiter waiter = new Waiter("����", 18);
        Cook cook = new Cook("�ؿ���", 30);
        System.out.println(waiter.getAge()+"��ķ���Ա"+waiter.getName());
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
        System.out.println("��˵��");
    }
}
class Waiter extends Employee {

    public Waiter(String name, int age) {
        super(name, age);
        // TODO Auto-generated constructor stub
    }
    
    public void work() {
        //18��ķ���Ա����,��˵��,�ϲ�
       
        System.out.println("�ϲ�");
    }
}

class Cook extends Employee {

    public Cook(String name, int age) {
        super(name, age);
        // TODO Auto-generated constructor stub
    }
    // 30��ĳ�ʦ�ؿ���,��˵��,����
    public void work() {
        System.out.println("����");
    }
}
