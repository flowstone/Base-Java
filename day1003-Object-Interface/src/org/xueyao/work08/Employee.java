package org.xueyao.work08;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 9:01:07 AM
 */
public abstract class Employee {
    private String id;
    private String name;
    private double salary;
    
    public Employee(){}
    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public abstract void work();
    
}
