package com.itheima.cn;


/**
 * 2.����һ��int�͵����飬����10��Ԫ�أ��ֱ�ֵΪ0~9,Ȼ�������е�Ԫ�ض���ǰ��һ��λ�ã�
        ����a[0]=a[1],a[1]=a[2],...���һ��Ԫ�ص�ֵ��ԭ����һ��Ԫ�ص�ֵ��Ȼ������������
        ��ʾ��ʽ���£�
        ת�����Ԫ��˳�����£�
        1 2 3 4 5 6 7 8 9 0 
 * @author Yao Xue
 * @date Jul 8, 2017 7:42:32 PM
 */
public class Test02 {
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        int temp = a[0];
        for (int i = 0,j=1; i < a.length; i++) {
                if (j <= a.length-1) {
                    a[i] = a[j++];
                }
        }
        a[a.length-1] = temp;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
