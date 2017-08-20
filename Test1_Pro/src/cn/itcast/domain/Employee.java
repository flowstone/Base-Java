package cn.itcast.domain;

import java.util.Date;

/**
 * @author Yao Xue
 * @date Aug 19, 2017 8:22:09 PM
 */
public class Employee {
    private double id;
    private String name;
    private double age;
    private String sex;
    private double salary;
    private Date empdate;
    private double deptid;
    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Employee(double id, String name, double age, String sex, double salary, Date empdate, double deptid) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.empdate = empdate;
        this.deptid = deptid;
    }
    public double getId() {
        return id;
    }
    public void setId(double id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getAge() {
        return age;
    }
    public void setAge(double age) {
        this.age = age;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Date getEmpdate() {
        return empdate;
    }
    public void setEmpdate(Date empdate) {
        this.empdate = empdate;
    }
    public double getDeptid() {
        return deptid;
    }
    public void setDeptid(double deptid) {
        this.deptid = deptid;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", salary=" + salary
                + ", empdate=" + empdate + ", deptid=" + deptid + "]";
    }
    
    
}
