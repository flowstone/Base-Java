package com.itheima.cn;
/**
 * @author Yao Xue
 * @date Jul 8, 2017 8:11:06 PM
 */
public class Employee {
    private String name;
    private int salary;
    public Employee() {
    }
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    
}
