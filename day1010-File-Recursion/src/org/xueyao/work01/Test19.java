package org.xueyao.work01;

import java.io.File;
import java.util.Scanner;

/**
 * 键盘录入一个文件夹路径,统计该文件夹(包含子文件夹)中每种类型的文件及个数
注意:用文件类型(后缀名,不包含.(点),如："java","txt")作为key,
    用个数作为value,放入到map集合中,并用两种方式遍历map集合
    例如：
    doc 的类型的文件有  3 个
    java 的类型的文件有  5 个
    txt 的类型的文件有  7 个

 * @author Yao Xue
 * @date Jul 31, 2017 12:44:12 AM
 */
public class Test19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件夹路径");
        //String path = sc.nextLine();
        String path = "D:\\Temp\\JavaRunTestCodeFolder";
        File f = new File(path);
        scanFileToFilter(f);
    }
    public static void scanFileToFilter(File f) {
        File[] arr = f.listFiles();
        for (File f2: arr) {
            if (f2.isFile()) {
                System.out.println(f2);
            } else {
                scanFileToFilter(f2);
            }
        }
    }
}
