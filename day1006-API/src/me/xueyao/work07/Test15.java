package me.xueyao.work07;
/**
 * 使用正则表达式切割字符串
* 192.168.105.27 按照  . 号切割字符串
* 18 22 40 65 按照空格切割字符串

 * @author Yao Xue
 * @date Jul 25, 2017 8:48:11 PM
 */
public class Test15 {
    public static void main(String[] args) {
        String string = "192.168.105.27";
        String[] split = string.split("\\.");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        
        String str2 = "18   22  40  65";
        String[] split2 = str2.split("\\s+");
        for (int i = 0; i < split2.length; i++) {
            System.out.println(split2[i]);
            
        }
    }
}
