package org.xueyao06.employee;
/**
 * @author Yao Xue
 * @date Jul 20, 2017 3:16:22 PM
 */
public class HardWare extends Employee{
    public HardWare(String name, String id) {
        super(name, id);
    }
    
    @Override
    public void work() {
        System.out.println("工号："+getId()+"的"+getName()+"正在开发硬件");
    }
}
