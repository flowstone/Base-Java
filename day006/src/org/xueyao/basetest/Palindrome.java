package org.xueyao.basetest;
/**
 * TODO ���󣺴�ӡ5λ���е����л�������
 *      ʲô�ǻ�������?������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
 * 
 * ������
 *      A:5λ���������������ݵķ�Χ,��forѭ��ʵ��
 *      B:�õ�ÿһ��5λ����,��ȡ���λ,ʮλ,ǧλ,��λ������
 *          ��λ�ȡ��?����x��һ��5λ��
 *          ��λ��x%10
 *          ʮλ��x/10%10
 *          ǧλ��x/10/10/10%10
 *          ��λ��x/10/10/10/10%10
 *      C:�������������ж�,�����������������������
 * @author Yao Xue
 * @date Jun 30, 2017 6:11:55 PM
 */
public class Palindrome {
    public static void main(String[] args) {
        getPalindrom();
    }
    
    public static void getPalindrom() {
        for (int i = 10000; i <= 99999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            int qian = i / 10 / 10 / 10 % 10;
            int wan = i / 10 / 10 / 10 / 10 % 10;
            
            if (ge == wan && shi == qian) {
                System.out.println(i);
            }
        }
    }
}
