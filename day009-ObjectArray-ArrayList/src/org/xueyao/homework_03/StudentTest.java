package org.xueyao.homework_03;

import java.util.ArrayList;

import org.xueyao.homework.Student;

/**
 * @author Yao Xue
 * @date Jul 6, 2017 4:08:17 PM
 */
public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        
        Student[] students = new Student[10];
        students[0] = new Student("小明", 18, 56);
        students[1] = new Student("小丽", 19, 57);
        students[2] = new Student("小芳", 20, 64);
        students[3] = new Student("小炎", 21, 56);
        students[4] = new Student("小电", 22, 60);
        students[5] = new Student("小风", 24, 80);
        students[6] = new Student("小水", 26, 90);
        students[7] = new Student("小脑", 24, 70);
        students[8] = new Student("小李", 29, 36);
        students[9] = new Student("小王", 17, 99);
        
        for (int i = 0; i < students.length; i++) {
            array.add(students[i]);
        }
        
        Student s = getMaxStudent(array);
        System.out.println(s.getName()+"---"+s.getAge()+"---"+s.getScore());
        getSumScore(array);
        getAverageScore(array);
        getCountInfo(array);
    }
    
  //获取成绩最高的学员
    public static Student getMaxStudent(ArrayList<Student> array) {
        Student s = new Student();
        int index = 0;
        int max = array.get(0).getScore();
        for (int i = 0; i < array.size(); i++) {
            Student student  = array.get(i);
            if (max < student.getScore()) {
                index = i;
            }
        }
        s = array.get(index);
        return s;
    }
    
    //获取学生成绩的平均值
    public static void getAverageScore(ArrayList<Student> array) {
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            sum += s.getScore();
        }
        int average = sum / array.size();
        System.out.println("10个学生的平均分"+average);
    }
    
  //获取学生成绩的总分值
    public static  void getSumScore(ArrayList<Student> array) {
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            sum += s.getScore();
        }
       
        System.out.println("10个学生的总成绩"+sum);
    }
    
    
  //打印不及格的学员信息及数量
    public  static  void getCountInfo(ArrayList<Student> array) {
        int count = 0;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getScore() < 60) {
                System.out.println(s.getName()+"---"+s.getAge()+"---"+s.getScore());
                count++;
            }
        }
        System.out.println("不及格的学员数量 "+count);
    }
}
