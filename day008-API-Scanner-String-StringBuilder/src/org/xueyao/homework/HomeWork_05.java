package org.xueyao.homework;

import java.util.Random;

/**
 * ������: ������������,���ô���ʵ��
    1.����String getStr(char[] chs)����
        ������������ȡ����Ϊ5������ַ������ַ����������4����дӢ����ĸ��1��0-9֮�䣨����0��9�����������
    2.����main��������������ɣ�
        (1)���峤��Ϊ26��Ԫ��ֵΪ26����дӢ����ĸ������chs
        (2)��������chs����getStr(char[] chs)��������ȡ����ֵ,���ڿ���̨��ӡ����ֵ   
 * @author Yao Xue
 * @date Jul 5, 2017 4:32:06 PM
 */
public class HomeWork_05 {
    public static void main(String[] args) {
        char[] chs = new char[26];
        for (int i = 0; i < chs.length; i++) {
            chs[i] = (char) (65 + i);
        }

        String s = getStr(chs);
        System.out.println(s);
    }

    private static String getStr(char[] chs) {
        //StringBuilder sb = new StringBuilder();
        String s = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(26);
            //sb.append(chs[index]);
            s += chs[index];
        }
        int number = r.nextInt(10);
        //sb.append(number);
        s += number;
        return s;
        
    }
    
    
}
