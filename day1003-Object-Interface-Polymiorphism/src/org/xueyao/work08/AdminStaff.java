package org.xueyao.work08;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 9:14:36 AM
 */
public class AdminStaff extends Employee{
    public AdminStaff(){}
    
    public AdminStaff(String id,String name,double salary) {
        super(id,name,salary);
    }
    
    @Override
    public void work() {
        System.out.println("工号："+getId()+"，姓名："+getName()+"，工资："+getSalary()+"元，工作是采购");
    }

}
