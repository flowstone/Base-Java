package me.xueyao.list;

import java.io.File;

/**
 * File[] listFiles()  返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。 列出指定目录下面的所有子文件和子文件夹
 *  需求：扫描D:\\test下的所有子文件和子文件夹，打印出哪些是文件夹哪些是文件。
 * @author Yao Xue
 * @date Jul 31, 2017 1:16:47 PM
 */
public class ListFilesDemo {
    public static void main(String[] args) {
        //创建对象
        File f = new File("D:\\Temp\\Temp");
        //调用方法列出指定目录所有子文件和子文件夹
        File[] arr = f.listFiles();
        //遍历
        for (File f2 : arr) {
            //System.out.println(f2); //绝对路径
            //判断
            if (f2.isDirectory()) {
                //说明f2是文件夹
                System.out.println("文件夹--"+f2.getName());
            } else {
                //说明f2是文件
                System.out.println("文件--"+f2.getName());
            }
        }
    }
}
