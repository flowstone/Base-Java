package org.xueyao.work.file;

import java.io.File;

/**
 * 1.判断File对象是否文件,是文件则输出：xxx是一个文件，否则输出：xxx是不是一个文件。
 *  2.判断File对象是否文件夹,是文件夹则输出：xxx是一个文件夹，否则输出：xxx是不是一个文件夹。(xxx是文件名或文件夹名)
 * @author Yao Xue
 * @date Jul 30, 2017 8:11:33 PM
 */
public class Test07 {
    public static void main(String[] args) {
        File f = new File("D:\\aaa\\1.txt");
        if (f.isFile()) {
            System.out.println(f.getName()+"是一个文件");
        } else {
            System.out.println(f.getName()+"是不是一个文件");
        }
        File f1 = new File("D:\\aaa");
        if (f1.isDirectory()) {
            System.out.println(f1.getName()+"是一个文件夹");
        } else {
            System.out.println(f1.getName()+"不是一个文件夹");
        }
    }
}
