package com.itheima;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jul 6, 2017 12:36:31 PM
 */
public class StudentManangerTest {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        while (true) {
            System.out.println("------- 欢迎来到学生管理系统，请选择： -------");
            System.out.println("1 查看所有学生");
            System.out.println("2 添加学生");
            System.out.println("3 删除学生");
            System.out.println("4 修改学生");
            System.out.println("5 退出");
            
            System.out.println("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String number = sc.nextLine().trim();
            switch (number) {
            case "1":
                //查看所有学生
                findAllStudent(array);
                break;
            case "2":
                //添加学生
                addStudent(array);
                break;
            case "3":
                //删除学生
                deleteStudent(array);
                break;
            case "4":
                //修改学生
                updateStuent(array);
                break;  
            case "5":
            default:
                System.out.println("谢谢使用");
                System.exit(0);
            }
        }
        
       
    }
    //修改学生
    private static void updateStuent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("不好意思，目前没有学生信息");
            return;
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要修改的学生的学号：");
        String id = sc.nextLine();
        
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getId().equals(id)) {
                index = i;
                break;
            }
        }
        
        if (index == -1) {
            System.out.println("不好意思，你要修改的学号对应的学生信息不存在，请重新选择");
            return;
        } 
        
        System.out.println("请你输入新的姓名");
        String name = sc.nextLine().trim();
        System.out.println("请你输入新的年龄");
        String age = sc.nextLine().trim();
        System.out.println("请你输入新的地址");
        String address = sc.nextLine().trim();
        Student s = new Student();
        s.setId(id);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        array.set(index,s);
        
        System.out.println("修改学生信息正确");
    }
    //删除学生
    private static void deleteStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("不好意思，目前没有学生信息");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您 要删除的学生的学号：");
        String id = sc.nextLine().trim();
        
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getId().equals(id)) {
                index = i;
                break;
            }
        }
        
        if (index == -1) {
            System.out.println("不好意思，你要删除的学号对应的学生信息不存在，请重新选择");
        } else {
            array.remove(index);
            System.out.println("删除学生成功");
        }
        
    }
    
    //添加学生
    private static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("请输入学生学号：");
            id = sc.nextLine().trim();
            
            Boolean flag = false;
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                if (id.equals(s.getId())) {  //说明学号被占用
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
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine().trim();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine().trim();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine().trim();
        
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        
        array.add(student);
        
        System.out.println("添加学生成功");
        
    }
    //查看学生
    private static void findAllStudent(ArrayList<Student> array) {
        // TODO Auto-generated method stub
        if (array.size() == 0) {
            System.out.println("不好意思，目前没有学生信息可供查询，请回去");
            return;
        } 
        
        System.out.println("学号\t\t姓名\t年龄\t居住地");
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            System.out.println(student.getId()+"\t"+student.getName()+"\t"+student.getAge()+"\t"+student.getAddress());
        }
    }
}
