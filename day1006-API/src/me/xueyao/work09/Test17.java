package me.xueyao.work09;
/**
 * 通过代码实现:
把字符串 "Hello12345World6789012" 中所有数字替换为 "#" 
提示: 字符串类的replaceAll(String regex,string str)方法,使用str替换掉当前字符串中所有与正则表达式匹配的字符

 * @author Yao Xue
 * @date Jul 25, 2017 9:15:23 PM
 */
public class Test17 {
    public static void main(String[] args) {
        String str = "Hello12345World6789012";
        String replaceAll = str.replaceAll("\\d", "#");
        System.out.println(replaceAll);
    }
}
