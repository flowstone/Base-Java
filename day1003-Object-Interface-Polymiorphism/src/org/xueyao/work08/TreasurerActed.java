package org.xueyao.work08;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 9:41:01 AM
 */
public class TreasurerActed extends Treasurer implements Actor{
    
    public TreasurerActed(){}
    public TreasurerActed(String id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public void play() {
        System.out.println("工号："+getId()+"，姓名："+getName()+"，工资："+getSalary()+"元，表演玩魔术");

    }

}
