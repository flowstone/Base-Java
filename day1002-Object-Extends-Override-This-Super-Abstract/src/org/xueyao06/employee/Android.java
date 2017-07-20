package org.xueyao06.employee;
/**
 * @author Yao Xue
 * @date Jul 20, 2017 3:10:17 PM
 */
public class Android extends Employee{
    public Android(String name, String id) {
        super(name, id);
    }
    
    @Override
    public void work() {
        System.out.println("工号："+getId()+"的"+getName()+"正在开发淘宝安卓APP!");
    }
}
