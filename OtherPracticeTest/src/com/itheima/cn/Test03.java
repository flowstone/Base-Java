package com.itheima.cn;
/**
 * 3 . ��дһ��Java������һ��String�ַ���"   ab123cd  "������Ҫȥ���ַ������˵Ŀհ׺�
 * ��ȡ���ַ����е�123����ȡ��ȡ�������ַ������ȣ������Ⱥͽ�ȡ�����ַ����ڿ���̨��ӡ�����
 * @author Yao Xue
 * @date Jul 8, 2017 7:42:40 PM
 */
public class Test03 {
    public static void main(String[] args) {
        String s = "   ab123cd  ";
        String s1 = s.trim();
        
        String s2 = s1.substring(2, 5);
        System.out.println(s2);
                
    }
}
