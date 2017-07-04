package org.xueyao.homework;
/**
 * ��Ŀ����ͳ���Ա������
 * @author Yao Xue
 * @date Jul 3, 2017 5:08:22 PM
 */
public class ManagerCoderTest {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setId(100);
        manager.setSalary(15000);
        manager.setBonus(6000);
        
        manager.work();
        
        Coder coder = new Coder();
        coder.setId(101);
        coder.setSalary(10000);
        coder.work();
        
        System.out.println("--------------------");
        
        Manager manager2 = new Manager("С��", 123, 15000, 5000);
        manager2.work();
        
        Coder coder2 = new Coder("С��", 124, 4500);
        coder2.work();
    }
}
