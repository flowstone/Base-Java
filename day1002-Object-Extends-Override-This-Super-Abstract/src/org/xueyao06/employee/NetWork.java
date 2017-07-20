package org.xueyao06.employee;
/**
 * @author Yao Xue
 * @date Jul 20, 2017 3:18:27 PM
 */
public class NetWork extends Employee{

    public NetWork(String name, String id) {
        super(name, id);
    }
    
    @Override
    public void work() {
        System.out.println("工号："+getId()+"的"+getName()+"正在维护官网!");
    }
}
