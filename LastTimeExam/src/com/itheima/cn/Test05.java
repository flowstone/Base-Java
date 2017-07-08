package com.itheima.cn;

import java.util.ArrayList;

/**
 *  5 . 
    1������һ��Ա����Employee����Ա˽�������У�name(����)String���ͣ�salary�����ʣ�int���ͣ����ɶ�Ӧ��set/get�����Լ����ι���
    2������һ�������࣬��main�������������Ҫ��
    a.����5��Employee����ֱ�ֵ���£�
    ������-���ʣ������� 2100, ���� 1700, С�� 1800, С�� 2600, ���� 3800��
    b.����һ��Ա�����ArrayList���ϣ�����5��Ա�������ŵ�ArrayList�� ��
    c.�������ϣ���nameΪС����Ԫ�ص�salary����300��
    d.�ڿ���̨����޸ĺ󼯺��е�Ԫ������
 * @author Yao Xue
 * @date Jul 8, 2017 7:44:31 PM
 */
public class Test05 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("����",2100);
        Employee employee2 = new Employee("����",1700);
        Employee employee3 = new Employee("С��",1800);
        Employee employee4 = new Employee("С��",2600);
        Employee employee5 = new Employee("����",3800);
        
        ArrayList<Employee> arrayList = new ArrayList<Employee>();
        arrayList.add(employee1);
        arrayList.add(employee2);
        arrayList.add(employee3);
        arrayList.add(employee4);
        arrayList.add(employee5);
        
        for (int i = 0; i < arrayList.size(); i++) {
            Employee e = arrayList.get(i);
            if (e.getName().startsWith("С��")) {
                e.setSalary(e.getSalary()+300);
            }
        }
        
        for (int i = 0; i < arrayList.size(); i++) {
            Employee employee  = arrayList.get(i);
            System.out.println(employee.getName()+"----"+employee.getSalary());
        }
    }
}
