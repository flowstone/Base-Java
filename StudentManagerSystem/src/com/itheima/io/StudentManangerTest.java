package com.itheima.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jul 6, 2017 12:36:31 PM
 */
public class StudentManangerTest {
    public static void main(String[] args) throws IOException {
        String fileName = "student.txt";
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
                findAllStudent(fileName);
                break;
            case "2":
                //添加学生
                addStudent(fileName);
                break;
            case "3":
                //删除学生
                deleteStudent(fileName);
                break;
            case "4":
                //修改学生
                updateStuent(fileName);
                break;  
            case "5":
            default:
                System.out.println("谢谢使用");
                System.exit(0);
            }
        }
        
       
    }
    
    //读数据到集合中
    private static void readData(String fileName, ArrayList<Student> arrayList) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = bufferedReader.readLine())!=null) {
            String[] split = line.split(",");
            Student student = new Student();
            student.setId(split[0]);
            student.setName(split[1]);
            student.setAge(split[2]);
            student.setAddress(split[3]);
            
            arrayList.add(student);
        }
        bufferedReader.close();
    }
    
    private static void writeData(String fileName, ArrayList<Student> arrayList) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(student.getId());
            stringBuilder.append(",");
            stringBuilder.append(student.getName());
            stringBuilder.append(",");
            stringBuilder.append(student.getAge());
            stringBuilder.append(",");
            stringBuilder.append(student.getAddress());
            
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
    }
    
    //修改学生
    private static void updateStuent(String fileName) throws IOException {
        ArrayList<Student> array = new ArrayList<Student>();
        readData(fileName, array);
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
        writeData(fileName, array);
        System.out.println("修改学生信息正确");
    }
    //删除学生
    private static void deleteStudent(String fileName) throws IOException {
        ArrayList<Student> array = new ArrayList<Student>();
        readData(fileName, array);
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
            writeData(fileName, array);
            System.out.println("删除学生成功");
        }
        
    }
    
    //添加学生
    private static void addStudent(String fileName) throws IOException {
        ArrayList<Student> array = new ArrayList<Student>();
        readData(fileName, array);
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
        writeData(fileName, array);
        System.out.println("添加学生成功");
        
    }
    //查看学生
    private static void findAllStudent(String fileName) throws IOException {
        ArrayList<Student> array = new ArrayList<Student>();
        readData(fileName, array);
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
