package org.xueyao06.employee;
/**
 * @author Yao Xue
 * @date Jul 20, 2017 3:20:29 PM
 */
public class EmployeeDemo {
    public static void main(String[] args) {
        JavaEE javaEE = new JavaEE("小明", "开发部-102");
        javaEE.work();
        
        Android android = new Android("李四", "开发部-112");
        android.work();
        
        HardWare hardWare = new HardWare("张三", "开发部-122");
        hardWare.work();
        
        NetWork netWork = new NetWork("张丽", "开发部-132");
        netWork.work();
    }
}
