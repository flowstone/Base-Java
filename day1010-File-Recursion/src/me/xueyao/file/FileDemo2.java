package me.xueyao.file;

import java.io.File;
import java.io.IOException;

/**
 *  boolean createNewFile() 当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。 
 *  注意：
 *  1.这个方法创建的一定是文件，文件是可以没有后缀名的
 *  2.如果指定路径不存在那么就会报异常：
 *  java.io.IOException: 系统找不到指定的路径。
 * @author Yao Xue
 * @date Jul 31, 2017 12:57:22 PM
 */
public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        //创建对象 
//        File f = new File("D:\\ABCDEFab\\小明");  //目录不存在抛出异常
        File f = new File("D:\\Temp\\Temp\\abc");
        //创建文件
        boolean bool = f.createNewFile();
        System.out.println(bool);
    }
}
