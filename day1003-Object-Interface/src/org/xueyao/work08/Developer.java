package org.xueyao.work08;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 9:22:51 AM
 */
public class Developer extends Employee{
    public Developer(){}
    public Developer(String id, String name, double salary) {
        super(id,name,salary);
    }
    @Override
    public void work() {
        System.out.println("工号："+getId()+"，姓名："+getName()+"，工资："+getSalary()+"元，工作是编程");
  
    }
    
}
