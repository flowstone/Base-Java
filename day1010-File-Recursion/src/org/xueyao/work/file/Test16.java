package org.xueyao.work.file;

import java.io.File;
import java.util.Scanner;

/**
 * 从键盘接收一个文件夹路径,获得该文件夹大小并输出到控制台
 * 1.   创建键盘录入对象Scanner
    2.  定义字符串接收用户输入的文件夹路径
    3.  根据文件夹路径创建文件对象
    4.  定义一个方法calculate用来计算指定文件夹的大小，接收文件参数，返回long类型数值表示文件夹的大小。
    5.  调用calculate方法传入文件夹对象，在该方法内部获得文件夹中所有文件，得到一个文件数组，定义一个变量size累加每一个文件的大小，遍历文件数组，判断是否是文件，如果是文件则获得文件大小并累加到变量size中，如果是文件夹，继续递归调用当前方法。

 * @author Yao Xue
 * @date Jul 30, 2017 9:59:28 PM
 */
public class Test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件夹的路径");
        String path = sc.nextLine();
        File f = new File(path);
        long size = calculate(f);
        System.out.println(size);
    }
    
    public static long calculate(File f) {
        File[] arr = f.listFiles();
        long size = 0;
        for (File f2: arr) {
            if (f2.isFile()) {
               size += f2.length();
            } else {
                calculate(f2);
            }
        }
        return size;
    }
}
