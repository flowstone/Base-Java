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
            char[] chs = arr[i].toCharArray();
            if ((chs[0] >= 46 && chs[0] <= 57) ||(chs[chs.length-1] >= 46 && chs[chs.length-1] <= 57)) {
                //arr[i].toUpperCase();
                System.out.println(arr[i].toUpperCase());
            }
        }
    }
}
