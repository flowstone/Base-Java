package org.xueyao06.employee;
/**
 * @author Yao Xue
 * @date Jul 20, 2017 3:14:12 PM
 */
public class JavaEE extends Employee{
    public JavaEE(String name, String id) {
        super(name, id);
    }
    
    @Override
    public void work() {
        System.out.println("工号："+getId()+"的"+getName()+"正在开发淘宝服务端");
    }
}
