package org.xueyao02.niming;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 10:05:29 AM
 */
public class Person {
    //private String name = "��Ա����";  //��ʼ��
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person() {
        // TODO Auto-generated constructor stub
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
    
    public void walk() {
        System.out.println(name+age+"����Ϻ��ߵ�������");
    }
    
}
