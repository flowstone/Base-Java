package org.xueyao03.string;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 10:27:57 AM
 */
public class StringDemo {
    public static void main(String[] args) {
        method();
        method2();
        method3();
        method4();
        method5();
    }
    /**
     * 5. ������ʽ
         *  1. toCharArray() �ַ�������ַ�����,����char[]
            2. toUpperCase() ת�ɴ�д ����String
            3. toLowerCase() ת��Сд ����String
            4. split() �и��ַ��� ����String[]
            5.  trim() ȥ���ַ������˿ո� ����String
            6.  replace �滻�����ַ�
     */
    private static void method5() {
        // TODO Auto-generated method stub
        char[] charArray = "Hello".toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
        
        String lowerCase = "Hello".toLowerCase();
        System.out.println(lowerCase);
        
        String upperCase = "Hello".toUpperCase();
        System.out.println(upperCase);
        
        String[] split = "Hello,World,How,are,you".split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        
        System.out.println(" aba dajfak dfa dasf adfa daf ".trim());
        
        String replace = "abcef".replace("ab", "gh");
        System.out.println(replace);
        
        String replace2 = "abcdef".replace("ac", "hh");
        System.out.println(replace2);
    }
    /**
     * 4. ��ȡ��ʽ
            1. charAt   ��������,��ȡ�ַ� ���� char
            2. indexOf  �����ַ�,��ȡ���� ����int(���޷���-1)
            3. substring ��ȡ�ַ���һ���� ����String
            4. length   �ַ������� ����int
     */
    private static void method4() {
        // TODO Auto-generated method stub
        char charAt = "Hello".charAt(3);
        System.out.println(charAt);
        
        int indexOf = "Hello".indexOf("ll");
        System.out.println(indexOf);
        
        String substring = "Hello".substring(2);
        System.out.println(substring);
    }
    /**
     * 3. �жϷ��� 
            1. equals �ж������ַ����Ƿ�ȫ��
            2. equalsIgnoreCase �ж������ַ����Ƿ�ȫ��,���Դ�Сд
            3. startsWith �ж��ַ�����ͷ,�����Դ�Сд
            4. endsWith   �ж��ַ�����β
            5. contains   �Ƿ�������ֶ�
     */
    private static void method3() {
        // TODO Auto-generated method stub
        boolean equals = "abc".equals("Abc");
        System.out.println(equals);
        boolean equalsIgnoreCase = "abc".equalsIgnoreCase("Abc");
        System.out.println(equalsIgnoreCase);
        
        boolean startsWith = "Hello World".startsWith("Hell");
        System.out.println(startsWith);
        boolean endsWith = "Hello World".endsWith("ld");
        System.out.println(endsWith);
        
        boolean contains = "Hello World".contains("or");
        System.out.println(contains);
    }
   
    
    //���췽��
    public static void method2() {
        char[] value = new char[]{'a','b','c','d','e'};
        String string = new String(value);
        System.out.println(string);
        
        String string2 = new String(value, 1, 3);
        System.out.println(string2);
    }
    //���巽ʽ
    public static void method() {
        String s = "abc"; //�ڷ������г�������
        String s2 = new String("abc"); // �ڶ��б�����ַ����ڳ������еĵ�ַ
        System.out.println(s);
        System.out.println(s2);
    }
}
