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
     * 5. 其他方式
         *  1. toCharArray() 字符串变成字符数组,返回char[]
            2. toUpperCase() 转成大写 返回String
            3. toLowerCase() 转成小写 返回String
            4. split() 切割字符串 返回String[]
            5.  trim() 去掉字符串两端空格 返回String
            6.  replace 替换已有字符
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
     * 4. 获取方式
            1. charAt   传递索引,获取字符 返回 char
            2. indexOf  传递字符,获取索引 返回int(若无返回-1)
            3. substring 获取字符串一部分 返回String
            4. length   字符串长度 返回int
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
     * 3. 判断方法 
            1. equals 判断两个字符串是否全等
            2. equalsIgnoreCase 判断两个字符串是否全等,忽略大小写
            3. startsWith 判断字符串开头,不忽略大小写
            4. endsWith   判断字符串结尾
            5. contains   是否包含否字段
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
   
    
    //构造方法
    public static void method2() {
        char[] value = new char[]{'a','b','c','d','e'};
        String string = new String(value);
        System.out.println(string);
        
        String string2 = new String(value, 1, 3);
        System.out.println(string2);
    }
    //定义方式
    public static void method() {
        String s = "abc"; //在方法区中常量池中
        String s2 = new String("abc"); // 在堆中保存该字符串在常量池中的地址
        System.out.println(s);
        System.out.println(s2);
    }
}
