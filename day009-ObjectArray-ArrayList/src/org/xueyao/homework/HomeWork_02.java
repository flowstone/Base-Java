package org.xueyao.homework;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * �ڶ��⣺�����������󣬲��ô���ʵ��    
        1.����ArrayList���ϣ��������ַ���"abc" "def"  "efg" "qwe" "swd" "wwe"
        2.ʹ����ͨforѭ����ȡ����������Ϊ3��Ԫ�ز���ӡ
        3.ʹ�õ�������������,��ӡ���е�Ԫ��
        4.ʹ����ǿforѭ���������ϲ���ӡ���е�Ԫ��
        5.��������,����"def"Ԫ��ʱ,"def"ֱ��ɾ����Ԫ��(����ʹ��Iterator�е�remove()����),��ֱ�Ӵ�ӡ����
        6.��������ÿ��Ԫ���е�Сд��ĸ��ɴ�д��ĸ
        7.����һ���Ļ�����,������ת����String���͵�����,������ӡ����

 * @author Yao Xue
 * @date Jul 6, 2017 2:55:40 PM
 */
public class HomeWork_02 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        //1.����ArrayList���ϣ��������ַ���"abc" "def"  "efg" "qwe" "swd" "wwe"
        array.add("abc");
        array.add("def");
        array.add("efg");
        array.add("qwe");
        array.add("swd");
        array.add("wwe");
        
        //2.ʹ����ͨforѭ����ȡ����������Ϊ3��Ԫ�ز���ӡ
        for (int i = 0; i < array.size(); i++) {
            if (i == 3) {
                System.out.println(array.get(i));
            }
        }
        // 3.ʹ�õ�������������,��ӡ���е�Ԫ��
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
        //.ʹ����ǿforѭ���������ϲ���ӡ���е�Ԫ��
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);
        }
        //5.��������,����"def"Ԫ��ʱ,"def"ֱ��ɾ����Ԫ��(����ʹ��Iterator�е�remove()����),��ֱ�Ӵ�ӡ����
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            if (s.startsWith("def")) {
                array.remove(i);
            }
        }
        //6.��������ÿ��Ԫ���е�Сд��ĸ��ɴ�д��ĸ
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            array.set(i, s.toUpperCase());
        }
        //7.����һ���Ļ�����,������ת����String���͵�����,������ӡ����
        String[] strings = new String[array.size()];
        for (int i = 0; i < array.size(); i++) {
            strings[i] = array.get(i);
            System.out.println(strings[i]);
        }
    }
}
