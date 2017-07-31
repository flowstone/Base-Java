package org.xueyao.work.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 键盘录入一个文件路径，根据文件路径创建File对象
    如果输入的文件路径对应的文件不存在，则创建该文件。
    如果输入的文件路径对应的文件已经存在了，则获得文件大小并输出。

 * @author Yao Xue
 * @date Jul 30, 2017 8:44:30 PM
 */
public class Test11 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件路径");
        String path = sc.nextLine();
        File f = new File(path);
        if (!f.exists()) {
            System.out.println("没有存在");
            boolean boo = f.createNewFile();
            System.out.println(boo);
        } else {
            long size = f.length();
            System.out.println("文件大小为"+size);
        }
        
    }
}
