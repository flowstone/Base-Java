package org.xueyao.homework;
/**
 * @author Yao Xue
 * @date Jul 4, 2017 8:48:19 AM
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(123);
        employee.setName("С��");
        employee.setSalary(10000);
        employee.print();
        
        Employee employee2 = new  Employee("С��", 123, 10000);
        employee2.print();
        
        
    }
}
