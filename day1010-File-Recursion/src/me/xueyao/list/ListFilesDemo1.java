package me.xueyao.list;

import java.io.File;

/**
 *  * 需求：获取指定路径下后缀名为.jpg的文件,并输出其绝对路径

 * @author Yao Xue
 * @date Jul 31, 2017 1:25:57 PM
 */
public class ListFilesDemo1 {
    public static void main(String[] args) {
        //创建对象 
        File f = new File("D:\\Temp\\Temp");
        //调用方法列出指定目录下面的所有子文件和子文件夹
        File[] arr = f.listFiles();
        //遍历
        for (File f2 : arr) {
            //u判断
            if (f2.isFile()) {
                //说明f2是文件
                //判断f2的最后一级目录后缀名是否是.jpg
                String name = f2.getName();
                if (name.endsWith(".png")) {
                    System.out.println(f2.getAbsolutePath());
                }
            }
        }
    }
}
