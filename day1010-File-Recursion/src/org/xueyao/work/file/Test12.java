package org.xueyao.work.file;

import java.io.File;
import java.util.Scanner;

/**
 * 键盘录入一个文件路径，根据文件路径创建文件对象，判断是文件还是文件夹
如果是文件，则输出文件的大小
如果是文件夹，则计算该文件夹下所有文件大小之和并输出(不包含子文件夹)。

 * @author Yao Xue
 * @date Jul 30, 2017 8:58:46 PM
 */
public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件路径 ");
        String path = sc.nextLine();
        File f = new File(path);
        if (f.isFile()) {
            long size = f.length();
            System.out.println("文件的大小"+size);
        } else {
            File[] arr = f.listFiles();
            int sum = 0;
            for (File s: arr) {
                sum += s.length();
            }
            System.out.println("所有文件大小之和:"+sum);
        }
    }
}
