package org.xueyao.work08;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 9:28:46 AM
 */
public class Treasurer extends Employee{
    
    public Treasurer(){}
    public Treasurer(String id,String name, double salary) {
        super(id,name,salary);
    }
    @Override
    public void work() {
        System.out.println("工号："+getId()+"，姓名："+getName()+"，工资："+getSalary()+"元，工作是对账");

        
    }

}
