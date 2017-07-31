package org.xueyao.work01;

import java.io.File;
import java.util.Scanner;

/**
 * 
 键盘录入一个文件夹路径，删除该路径下的文件夹。
要求：文件夹中包含有子文件夹

 * @author Yao Xue
 * @date Jul 30, 2017 11:48:55 PM
 */
public class Test18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个文件夹路径");
        String path = sc.nextLine();
        File f = new File(path);
        scanFileToFilter(f);
    }
    public static void scanFileToFilter(File f) {
        File[] arr = f.listFiles();
        for (File f2: arr) {
            
            if (f2.isFile()) {
                f2.delete();
                System.out.println("删除"+f2+"成功");
            } else {
                
                scanFileToFilter(f2);
            }
            //TODO:还没删除文件夹
        }
    }
}
