package org.xueyao.day009_03;
/**
 * @author Yao Xue
 * @date Jul 18, 2017 1:55:00 PM
 */
public class Test3_Employee {
    public static void main(String[] args) {
        
    }
}

abstract class Employee {
    private String name;
    private String id;
    private double salary;
    
    public Employee(){}
    public Employee(String name,String id,double salary) {
        this.name = name;
        this.id = name;
        this.salary = salary;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double getSalary() {
        return  salary;
    }
    
    public abstract void work();
}

class Coder extends Employee {

    public Coder() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Coder(String name, String id, double salary) {
        super(name, id, salary);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void work() {
        // TODO Auto-generated method stub
        System.out.println("�ҵ������ǣ�"+this.getName()+",�ҵĹ����ǣ�"+this.getId()+
                ",�ҵĹ����ǣ�"+this.getSalary()+",�ҵĹ����������ô���");
    }
    
}
