package org.xueyao.homework;
/**
 * @author Yao Xue
 * @date Jul 4, 2017 8:44:39 AM
 */
public class Employee {
    private String name;
    private int id;
    private double salary;
    
    public Employee() {
        
    }

    public Employee(String name, int id, double salary) {
        super();
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void print() {
        System.out.println("姓名："+name+"工号："+id+"工资："+salary);
    }
}
