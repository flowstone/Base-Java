package org.xueyao.homework;
/**
 * @author Yao Xue
 * @date Jul 6, 2017 3:15:32 PM
 */
public class StudentsTool {
    //遍历打印学生信息
    public void listStudents(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            System.out.println(student.getName()+"-----"+student.getAge()+"-----"+student.getScore());
        }
    }
    //获取学生成绩的最高分
    public int getMaxScore(Student[] arr) {
        int max = arr[0].getScore();
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].getScore()) {
                max = arr[i].getScore();
            }
            
        }
        return max;
    }
    
    //获取成绩最高的学员
    public Student getMaxStudent(Student[] arr) {
        Student s = new Student();
        int index = 0;
        int max = arr[0].getScore();
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].getScore()) {
                index = i;
            }
        }
        s = arr[index];
        return s;
    }
    //获取学生成绩的平均值
    public int getAverageScore(Student[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getScore();
        }
        int average = sum / arr.length;
        return average;
    }
    //获取不及格的学员数量
    public int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getScore() < 60) {
                count++;
            }
        }
        return count;
    }
}
