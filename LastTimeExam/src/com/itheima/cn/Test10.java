package com.itheima.cn;
/**
 **����һ������Ϊ4��String�������飬��������Ԫ�أ���12ab������java������45Cd������Server78����������������жϣ�����ַ���������
�ֿ�ͷ���β���ͽ����ַ����а�����Сд�ַ���ת���ɴ�д�ַ��������ڿ���̨��ӡ����� 
 * @author Yao Xue
 * @date Jul 9, 2017 4:29:12 PM
 */
public class Test10 {
    public static void main(String[] args) {
        String[] str = {"12ab","java","45Cd","Server78"};
        for (int i = 0; i < str.length; i++) {
            boolean flag = false;
            char[] chs = str[i].toCharArray();
            if (chs[0] <='9' &&chs[0]>='0' || chs[chs.length-1] <='9'&&chs[chs.length-1]>='0') {
                flag = true;
            }
            if (flag) {
                System.out.println(str[i].toUpperCase());
            }
        }
    }
}
