package org.xueyao.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jul 9, 2017 8:57:58 AM
 */
public class StudentManager {
    public static void main(String[] args) throws IOException {
        //定义文件路径
        String fileName = "student_data.txt";
        Scanner sc = new Scanner(System.in);
        
        while (true) {

            System.out.println("------- 欢迎来到学生管理系统，请选择： -------");
            System.out.println("1 查看所有学生");
            System.out.println("2 添加学生");
            System.out.println("3 删除学生");
            System.out.println("4 修改学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");
            String id = sc.nextLine();
            
            switch (id) {
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
                    updateStudent(fileName);
                    break;
                case "5":
                default:
                    System.out.println("谢谢使用");
                    System.exit(0);
            }
            
        }
    }
    
    //从文件中读数据到集合
    public static void readData(String fileName, ArrayList<Student> arrayList) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        
        String line;
        while ((line=bufferedReader.readLine())!=null) {
            String[] datas = line.split(",");
            Student student = new Student();
            student.setId(datas[0]);
            student.setName(datas[1]);
            student.setAge(datas[2]);
            student.setAddress(datas[3]);
            
            arrayList.add(student);
        }
        bufferedReader.close();
    }
    
    //把集合中的数据写入文件
    public static void writeData(String fileName, ArrayList<Student> arrayList) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(student.getId()).append(",").append(student.getName())
            .append(",").append(student.getAge()).append(",").append(student.getAddress());
            
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        
        bufferedWriter.close();
    }
   //查看所有学生
    private static void findAllStudent(String fileName) throws IOException {
        // TODO Auto-generated method stub
        //创建集合对象
        ArrayList<Student> arrayList = new ArrayList<Student>();
        readData(fileName, arrayList);
        
        if (arrayList.size() == 0) {
            System.out.println("不好意思，目前没有学生信息");
            return;
        }
        
        System.out.println("学号\t\t姓名\t年龄\t居住地\t");
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            System.out.println(student.getId()+"\t"+student.getName()+"\t"+student.getAge()+"\t"+student.getAddress());
        }
        
    }
    
    //添加学生
    private static void addStudent(String fileName) throws IOException {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        readData(fileName, arrayList);
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("请输入你的学号");
            id = sc.nextLine();
            boolean flag = false;
            for (int i = 0; i < arrayList.size(); i++) {
                if (id.equals(arrayList.get(i).getId())) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("学号重复");
            } else {
                break;
            }
        }
        
        System.out.println("请输入你的姓名");
        String name = sc.nextLine();
        System.out.println("请输入你的年龄");
        String age = sc.nextLine();
        System.out.println("请输入你的居住地");
        String address = sc.nextLine();
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        
        arrayList.add(student);
        
        //把集合中的数据重新写回到文件
        writeData(fileName, arrayList);
        System.out.println("添加学生信息成功");
        
    }
    
    //删除学生
    private static void deleteStudent(String fileName) throws IOException {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        readData(fileName, arrayList);
        if (arrayList.size() == 0) {
            System.out.println("不好意思，目前没有学生信息");
            return;
        }

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要删除学生的学号");
            String id = sc.nextLine();
            boolean flag = false;
            for (int i = 0; i < arrayList.size(); i++) {
                Student s = arrayList.get(i);
                if (id.equals(s.getId())) {
                    flag = true;
                    arrayList.remove(i);
                    break;
                }
            }
            if (!flag) {
                System.out.println("没有该学号学生的信息");
            } else {
                break;
            }
        }
        writeData(fileName, arrayList);
        System.out.println("删除学生信息成功");
    }
    
    //更新学生
    private static void updateStudent(String fileName) throws IOException {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        readData(fileName, arrayList);
        if (arrayList.size() == 0) {
            System.out.println("不好意思，目前没有学生信息");
            return;
        }

        int index = -1;
        Scanner sc = new Scanner(System.in);
        
        String id;
        while (true) {
            System.out.println("请输入你要修改的学生的学号");
            id = sc.nextLine();
            
            for (int i = 0; i < arrayList.size(); i++) {
                Student student = arrayList.get(i);
                if (id.equals(student.getId())) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.println("你输入学生的学号不存在");
            } else {
                break;
            }
        }
        
        System.out.println("请输入新的姓名：");
        String name = sc.nextLine();
        System.out.println("请输入新的年龄：");
        String age = sc.nextLine();
        System.out.println("请输入新的地址：");
        String address = sc.nextLine();
        
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        
        arrayList.set(index, student);
        writeData(fileName, arrayList);
        System.out.println("修改学生信息成功");
        
    }
    


}
