package org.xueyao_01;
/**
 * ѧ����Ĳ�����
 * @author Yao Xue
 * @date Jul 3, 2017 1:46:10 PM
 */
public class StudentDemo {
    public static void main(String[] args) {
        
        Student s = new Student();
        System.out.println(s.getName()+"----------"+s.getAge());
       
        s.setName("����ϼ");
        s.setAge(28);
        System.out.println(s.getName()+"----------"+s.getAge());
    }
}
