package com.itheima;


/**
 * * ���󣺴�ӡ5λ���е����л�������
 *      ʲô�ǻ�������?������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
 * 
 * ������
 *      A:5λ���������������ݵķ�Χ����forѭ��ʵ��
 *      B:��ȡÿһ��5λ����Ȼ��õ����ĸ�λ��ʮλ��ǧλ����λ
 *          ����x��һ��5λ����
 *              ��λ��x%10
 *              ʮλ��x/10%10
 *              ǧλ��x/10/10/10%10
 *              ��λ��x/10/10/10/10%10
 *      C:�����������������������

 * @author Yao Xue
 * @date Jul 2, 2017 11:57:06 AM
 */
public class PalindromeMethod {
    public static void main(String[] args) {
        printPalindrome();
    }

    public static void printPalindrome() {
        for (int i = 10000; i <= 99999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            //int bai = i / 10 / 10 % 10;
            int qian = i / 10 / 10 / 10 % 10;
            int wan = i / 10 / 10 / 10 / 10 % 10;
            
            if (ge == wan && shi == qian) {
                System.out.println(i);
            }
        }
    }
}
