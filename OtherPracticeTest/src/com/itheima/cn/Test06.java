package com.itheima.cn;
/**
 * ����һ������Ϊ4��String�������飬��������Ԫ�أ���12ab������java������45Cd������Server78����
 * ������������жϣ�����ַ����������ֿ�ͷ���β���ͽ����ַ����а�����Сд�ַ���ת���ɴ�д�ַ��������ڿ���̨��ӡ�����
 * @author Yao Xue
 * @date Jul 8, 2017 10:43:25 PM
 */
public class Test06 {
    public static void main(String[] args) {
        String[] arr = {"12ab","java","45Cd","Server78"};
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            if (s.charAt(0) >= '0' && s.charAt(0) <= '9' || s.charAt(s.length()-1) >= '0' && s.charAt(s.length()-1) <= '9') {
                System.out.println(s.toUpperCase());
            }
        }
    }
}
