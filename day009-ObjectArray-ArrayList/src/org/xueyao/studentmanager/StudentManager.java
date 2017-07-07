package org.xueyao.studentmanager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ------- 欢迎来到学生管理系统，请选择： -------
 * 1 查看所有学生
 * 2 添加学生
 * 3 删除学生
 * 4 修改学生
 * 5 退出
 * 
 * 请输入您要修改的学生的学号：
 * 不好意思，你要修改的学号对应的学生信息不存在，请重新选择
 * 
 * 请你输入新的姓名
 * 请你输入新的年龄
 * 请你输入新的地址
 * 
 * 修改学生信息正确
 * 
 * 请输入您 要删除的学生的学号：
 * 
 * 不好意思，你要删除的学号对应的学生信息不存在，请重新选择
 * 
 * 删除学生成功
 * 
 * 请输入学生学号：
 * 你输入的学号已经被占用，请重新输入
 * 
 * 请输入学生姓名：
 * 请输入学生年龄：
 * 请输入学生居住地：
 * 添加学生成功
 * 
 * 不好意思，目前没有学生信息可供查询，请回去
 * @author Yao Xue
 * @date Jul 7, 2017 11:07:54 AM
 */
public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();
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
                System.out.println("谢谢使用");
                System.exit(0);
                break;
            }
        }
    }
    

    private static void deleteStudent(ArrayList<Student> arrayList) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("请输入您 要删除的学生的学号：");
            id = sc.nextLine();
            Boolean flag = false;
            for (int i = 0; i < arrayList.size(); i++) {
                Student s = arrayList.get(i);
                if (!id.equals(s.getId())) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("不好意思，你要删除的学号对应的学生信息不存在，请重新选择");
            } else {
                break;
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            Student s = arrayList.get(i);
            if (id.equals(s.getId())) {
                arrayList.remove(i);
                System.out.println("删除学生成功");
            }
        }
        
    }

    private static void addStudent(ArrayList<Student> arrayList) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("请输入学生学号：");
            id = sc.nextLine();
            Boolean flag = false;
            for (int i = 0; i < arrayList.size(); i++) {
                Student s = arrayList.get(i);
                if (id.equals(s.getId())) {
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
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();
        
        Student student = new Student(id,name, age, address);
        arrayList.add(student);
        System.out.println("添加学生成功");
    }

   
    private static void findAllStudent(ArrayList<Student> arrayList) {
        // TODO Auto-generated method stub
        if (arrayList.size() == 0) {
            System.out.println("不好意思，目前没有学生信息可供查询，请回去");
            return;
        }
        
        System.out.println("学号\t\t姓名\t年龄\t居住地");
        for (int i = 0; i < arrayList.size(); i++) {
            Student s = arrayList.get(i);
            System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
        }
    }

    private static void updateStudent(ArrayList<Student> arrayList) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("请输入您 要修改的学生的学号：");
            id = sc.nextLine();
            Boolean flag = false;
            for (int i = 0; i < arrayList.size(); i++) {
                Student s = arrayList.get(i);
                if (id.equals(s.getId())) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            } else {
                System.out.println("不好意思，你要修改的学号对应的学生信息不存在，请重新选择");
            }
        }
        System.out.println("请你输入新的姓名");
        String name = sc.nextLine();
        System.out.println("请你输入新的年龄");
        String age = sc.nextLine();
        System.out.println("请你输入新的地址");
        String address = sc.nextLine();
        
        for (int i = 0; i < arrayList.size(); i++) {
            Student s = arrayList.get(i);
            if (id.equals(s.getId())) {
                s.setId(id);
                s.setName(name);
                s.setAge(age);
                s.setAddress(address);
                arrayList.set(i,s);
                System.out.println("删除学生成功");
            }
        }
        
    }
}
