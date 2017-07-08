package com.itheima.cn;

import java.util.ArrayList;

/**
 *  5 . 
    1、定义一个员工类Employee，成员私有属性有：name(姓名)String类型，salary（工资）int类型，生成对应的set/get方法以及满参构造
    2、创建一个测试类，在main方法中完成以下要求：
    a.创建5个Employee对象分别赋值如下：
    （姓名-工资）（静静 2100, 阿呆 1700, 小明 1800, 小新 2600, 赵四 3800）
    b.创建一个员工类的ArrayList集合，将这5个员工对象存放到ArrayList中 ；
    c.遍历集合，将name为小明的元素的salary增加300；
    d.在控制台输出修改后集合中的元素属性
 * @author Yao Xue
 * @date Jul 8, 2017 7:44:31 PM
 */
public class Test05 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("静静",2100);
        Employee employee2 = new Employee("阿呆",1700);
        Employee employee3 = new Employee("小明",1800);
        Employee employee4 = new Employee("小新",2600);
        Employee employee5 = new Employee("赵四",3800);
        
        ArrayList<Employee> arrayList = new ArrayList<Employee>();
        arrayList.add(employee1);
        arrayList.add(employee2);
        arrayList.add(employee3);
        arrayList.add(employee4);
        arrayList.add(employee5);
        
        for (int i = 0; i < arrayList.size(); i++) {
            Employee e = arrayList.get(i);
            if (e.getName().startsWith("小明")) {
                e.setSalary(e.getSalary()+300);
            }
        }
        
        for (int i = 0; i < arrayList.size(); i++) {
            Employee employee  = arrayList.get(i);
            System.out.println(employee.getName()+"----"+employee.getSalary());
        }
    }
}
