package me.xueyao.file;

import java.io.File;

/**
 * 创建文件夹：
 *  boolean mkdir() 创建此抽象路径名指定的目录。 
 *  注意：
 *      1.如果路径存在，那么直接创建文件夹，不存在那么不会创建，返回false
 *      2.记住这个方法一定是创建文件夹的
    boolean mkdirs()  创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。 创建多级目录 也可以创建单级目录
    注意：记住这个方法一定是创建文件夹的
 * @author Yao Xue
 * @date Jul 31, 2017 1:00:32 PM
 */
public class FileDmeo3 {
    public static void main(String[] args) {
        //创建对象 
        File f = new File("aaa\\1.txt");  // 1.txt不一定是文件
        //调用方法创建单级目录
        boolean boo = f.mkdir(); //false
        System.out.println(boo);
        
        boolean bool = f.mkdirs();  //true
        System.out.println(bool);
    }
}
