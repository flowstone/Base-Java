package com.itheima.cn;
/**
 * 3 . ��дһ��Java������һ��String�ַ���"   ab123cd  "������Ҫȥ���ַ������˵Ŀհ׺�
 * ��ȡ���ַ����е�123����ȡ��ȡ�������ַ������ȣ������Ⱥͽ�ȡ�����ַ����ڿ���̨��ӡ�����
 * @author Yao Xue
 * @date Jul 8, 2017 7:42:40 PM
 */
public class Test03 {
    public static void main(String[] args) {
        String str = "   ab123cd  ";
        String str1 = str.trim().substring(2, 5);
        int length = str1.length();
        System.out.println("���ȣ�"+length);
        System.out.println("��ȡ�����ַ�����"+str1);
    }
}
