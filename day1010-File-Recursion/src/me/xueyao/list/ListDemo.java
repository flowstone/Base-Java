package me.xueyao.list;

import java.io.File;

/**
 * String[] list() 返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录。 列出指定目录下面的所有子文件和子文件夹
 *  注意：
 *  1.如果指定路径不存在，这个方法返回null
 *  2.如果指定路径是文件不是文件夹，那么这个方法null
 *  3.如果指定文件夹存在，但是下面没有任何子文件或者子文件夹，那么返回的数组长度是0
 * @author Yao Xue
 * @date Jul 31, 2017 1:12:07 PM
 */
public class ListDemo {
    public static void main(String[] args) {
        //创建对象 
        File f = new File("D:\\Temp\\Temp");
        //调用方法列出指定目录下所有的子文件和子文件夹
        String[] arr = f.list();
        System.out.println(arr.length); //5
        //遍历
        for (String s : arr) {
            //System.out.println(s); //打印的是相关路径
        }
    }
}
