package org.xueyao.beans;
/**
 * @author Yao Xue
 * @date Aug 10, 2017 4:02:23 PM
 */
public class Employee {
    private String id;
    private String name;
    private float salary;
    public Employee() {
        super();
    }
    public Employee(String id, String name, float salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary +"]";
    }
    
    

}
