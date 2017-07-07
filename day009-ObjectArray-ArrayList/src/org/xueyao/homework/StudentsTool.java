package org.xueyao.homework;
/**
 * @author Yao Xue
 * @date Jul 6, 2017 3:15:32 PM
 */
public class StudentsTool {
    //������ӡѧ����Ϣ
    public void listStudents(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            System.out.println(student.getName()+"-----"+student.getAge()+"-----"+student.getScore());
        }
    }
    //��ȡѧ���ɼ�����߷�
    public int getMaxScore(Student[] arr) {
        int max = arr[0].getScore();
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].getScore()) {
                max = arr[i].getScore();
            }
            
        }
        return max;
    }
    
    //��ȡ�ɼ���ߵ�ѧԱ
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
    //��ȡѧ���ɼ���ƽ��ֵ
    public int getAverageScore(Student[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getScore();
        }
        int average = sum / arr.length;
        return average;
    }
    //��ȡ�������ѧԱ����
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
