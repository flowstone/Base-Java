package com.itheima.studentmanager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jul 7, 2017 4:03:03 PM
 */
public class StudentManagerTest {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 查看所有学生");
            System.out.println("2 添加学生");
            System.out.println("3 删除学生");
            System.out.println("4 修改学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");
            
            Scanner sc = new Scanner(System.in);
            String choiceString = sc.nextLine();
            switch (choiceString) {
            case "1":
                //查看所有学生
                findAllStudent(arrayList);
                break;
            case "2":
                //添加学生
                addStudent(arrayList);
                break;
            case "3":
                //删除学生
                deleteStudent(arrayList);
                break;
            case "4":
                //修改学生
                updateStudent(arrayList);
                break;
            case "5":
            default:
                System.out.println("谢谢你的使用");
                System.exit(0); //JVM退出
                break;
            }
        }
    }

    private static void updateStudent(ArrayList<Student> arrayList) {
        if (arrayList.size() == 0) {
            System.out.println("没有学生数据");
            return;
        }
        Scanner sc = new Scanner(System.in);
        String id;
        int index = -1;
        while (true) {
            System.out.println("请输入要修改的学生的学号");

            id = sc.nextLine();
            for (int i = 0; i < arrayList.size(); i++) {
                Student s = arrayList.get(i);
                if (s.getId().equals(id)) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.println("不好意思，你要修改的学号对应的学生信息不存在，请回去重新你的选择");
            } else {
                break;
            }
        }
        
        
        Student student = new Student();
        System.out.println("请输入新的名字");
        String name = sc.nextLine();
        System.out.println("请输入新的年龄");
        String age = sc.nextLine();
        System.out.println("请输入新的地址");
        String address = sc.nextLine();
        
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        arrayList.set(index, student);
        System.out.println("修改学生信息成功");
        
    }

    private static void deleteStudent(ArrayList<Student> arrayList) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要删除的学生的学号");
            String id = sc.nextLine();
            int index = -1;
            for (int i = 0; i < arrayList.size(); i++) {
                Student s = arrayList.get(i);
                if (id.equals(s.getId())) {
                    index = i;
                    arrayList.remove(index);
                    break;
                }
            }
            if (index == -1) {
                System.out.println("不好意思，你要删除的学号对应的学生信息不存在，请回去重新你的选择");
            } else {
                break;
            }
        }
        
        System.out.println("删除成功");
    }
    
    //添加学生
    private static void addStudent(ArrayList<Student> arrayList) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        String id;
        //为了让代码能够回到这时，用循环
        while (true) {
            System.out.println("请输入学生的学号");
            id = sc.nextLine();
            boolean flag = false;
            for (int i = 0; i < arrayList.size(); i++) {
                Student student = arrayList.get(i);
                if (student.getId().equals(id)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("你输入的学号已经被占用，请重新输入");
            } else {
                break;
            }
           
        }
        
        
        System.out.println("请输入学生的姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生的年龄");
        String age = sc.nextLine();
        System.out.println("请输入学生的居住地");
        String address = sc.nextLine();
        
        //创建学生对象
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        
        //把学生对象作为元素添加到集合中
        arrayList.add(student);
        System.out.println("添加学生信息成功");
        
    }

    private static void findAllStudent(ArrayList<Student> arrayList) {
        
        if (arrayList.size() == 0) {
            System.out.println("不好意思，目前没有学生信息可供查询，请回去重新选择你的操作");
            return;
        }
        System.out.println("学号\t\t姓名\t年龄\t居住地");
        for (int i = 0; i < arrayList.size(); i++) {
            Student s = arrayList.get(i);
            System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
        }
    }
}
