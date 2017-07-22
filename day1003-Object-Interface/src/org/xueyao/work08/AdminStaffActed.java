package org.xueyao.work08;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 9:33:24 AM
 */
public class AdminStaffActed extends AdminStaff implements Actor{
    public AdminStaffActed(){}
    public AdminStaffActed(String id, String name, double salary) {
        super(id, name, salary);
    }
    
    @Override
    public void play() {
        System.out.println("工号："+getId()+"，姓名："+getName()+"，工资："+getSalary()+"元，喜欢跳舞");

        
    }

}
