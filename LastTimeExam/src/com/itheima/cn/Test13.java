package com.itheima.cn;
/**
 * //��дһ��Java������һ��String�ַ���"   ab123cd  "��
//* ����Ҫȥ���ַ������˵Ŀհ׺󣬽�ȡ���ַ����е�123��
//* ��ȡ��ȡ�������ַ������ȣ������Ⱥͽ�ȡ�����ַ����ڿ���̨��ӡ�����
 * @author Yao Xue
 * @date Jul 9, 2017 5:26:54 PM
 */
public class Test13 {
    public static void main(String[] args) {
        //String str = "   ab12adfasdfsas3456465cd  ";
        String str = "   ab123cd  ";
        /*String str1 = str.trim().substring(2, 5);
        int len = str1.length();
        
        System.out.println("���ȣ�"+len+"��ȡ���ַ���"+str1);*/
        
        //������
        String str1 = str.trim();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) >= '0' && str1.charAt(i) <= '9') {
                sb.append(str1.charAt(i));
            }
        }
        String s = sb.toString();
        System.out.println("����Ϊ"+s.length()+"��ȡ�����ַ���"+s);
    }
}
