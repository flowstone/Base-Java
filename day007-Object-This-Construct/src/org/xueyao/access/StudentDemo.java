package org.xueyao.access;
/**
 * ѧ����Ĳ�����
 * @author Yao Xue
 * @date Jul 3, 2017 11:45:48 AM
 */
public class StudentDemo {
    public static void main(String[] args) {
        //����ѧ������
        Student s = new Student();
        s.show();
        
        s.name = "����ϼ";
       // s.age = 28;
        s.setAge(-28);
        s.show();
    }
}
