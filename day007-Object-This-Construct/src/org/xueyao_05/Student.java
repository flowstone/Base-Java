package org.xueyao_05;
/**
 * ����һ��ѧ����
        ��ѧ�����ж�����������:��ߺ�����
        �����������췽��
        �βηֱ�Ϊ:���,����,�Լ���ߺ�����
        ����һ��������ֱ�ʹ���������췽��
 * @author Yao Xue
 * @date Jul 3, 2017 4:08:03 PM
 */
public class Student {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int height;
    
    public Student(int height) {
        this.height = height;
    }
    
    public Student(String name) {
        this.name = name;
    }
    
    public Student(String name, int height) {
        this.name = name;
        this.height = height;
    }
}
