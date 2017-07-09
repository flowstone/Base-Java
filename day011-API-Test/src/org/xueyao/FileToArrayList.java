package org.xueyao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * ����һ����ı��ļ��е�ѧ����Ϣ��ȡ�����洢�������У�Ȼ��������ϣ��ڿ���̨���
 * @author Yao Xue
 * @date Jul 9, 2017 4:01:54 PM
 * ������ 
 *          A:����ѧ����
 *          B:�������뻺��������
 *          C���������϶���
 *          D����ȡ�ļ����� ���������ݰ���һ���ĸ�ʽ���зָֵ��ѧ������Ȼ���ѧ��������ΪԪ�ش洢��������
 *          E:�ͷ���Դ
 *          F����������
 *          
 */
public class FileToArrayList {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("array.txt"));
        
        ArrayList<Student> arrayList = new ArrayList<Student>();
        
        String line;
        while ((line = bufferedReader.readLine())!= null) {
            String[] strArray = line.split(",");
            Student student = new Student();
            student.setId(strArray[0]);
            student.setName(strArray[1]);
            student.setAge(strArray[2]);
            student.setAddress(strArray[3]);
            arrayList.add(student);
        }
        //�ͷ���Դ
        bufferedReader.close();
        
        //��������
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            System.out.println(student.getId()+"----"+student.getName()+"----"+student.getAge()+"----"+student.getAddress());
        }
        
    }
}
