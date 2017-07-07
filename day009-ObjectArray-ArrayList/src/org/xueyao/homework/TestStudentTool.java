package org.xueyao.homework;
/**
 * @author Yao Xue
 * @date Jul 6, 2017 3:31:00 PM
 */
public class TestStudentTool {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        Student s1 = new Student("小明", 18, 95);
        Student s2 = new Student("小丽", 19, 60);
        Student s3 = new Student("小贾", 25, 55);
        Student s4 = new Student("小路", 17, 88);
        Student s5 = new Student("小传", 35, 23);
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;
        StudentsTool studentsTool = new StudentsTool();
        studentsTool.listStudents(students);
        
        int max = studentsTool.getMaxScore(students);
        System.out.println("max:"+max);
        
        Student s = studentsTool.getMaxStudent(students);
        System.out.println(s.getName()+"---"+s.getAge()+"---"+s.getScore());
        
        int average = studentsTool.getAverageScore(students);
        System.out.println("average:"+average);
        
        int count = studentsTool.getCount(students);
        System.out.println("不及格数量"+count);
    }
}
