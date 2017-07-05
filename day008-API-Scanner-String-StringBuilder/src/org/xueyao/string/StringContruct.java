package org.xueyao.string;

/**
 * String:�ַ�����
 *      �ɶ���ַ���ɵ�һ������
 *      �ַ����䱾����һ���ַ�����
 * 
 * ���췽����
 *      public String(String original):���ַ������ݷ�װ���ַ�������
 *      public String(char[] value)  �����ַ���������ݷ�װ���ַ�������
 *      public String(char[] value,int offset,int count) �� ���ַ������е�һ�������ݷ�װ���ַ�������
 *      
 * ע�⣺�ַ�����һ�ֱȽ�����������������ͣ�ֱ������ַ�������������Ǹö����е����ݡ�
 * @author Yao Xue
 *
 */
public class StringContruct {
    public static void main(String[] args) {
        // public String(String original)
        String s1 = new String("Hello");
        System.out.println("s1:"+s1);
        
        //public String(char[] value)
        char[] chs = {'H','e','l','l','o'};
        String s2 = new String(chs);
        System.out.println("s2:"+s2);
        
    }
}
