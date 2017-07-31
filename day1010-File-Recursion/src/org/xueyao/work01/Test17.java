package org.xueyao.work01;

import java.io.File;

/**
 * 使用文件过滤器筛选将指定文件夹下的小于200K的小文件获取并打印(包括所有子文件夹的文件)。
 * 1.先递归文件夹下的所有文件,
 * 2.把所有文件,传递给过滤器过滤小于200K的文件
 * @author Yao Xue
 * @date Jul 30, 2017 10:13:37 PM
 */
public class Test17 {
    public static void main(String[] args) {
        File f = new File("D:\\Temp\\JavaRunTestCodeFolder");
        scanFileToFolder(f);
    }
    
    public static void scanFileToFolder(File f) {
        File[] arr = f.listFiles(new MyFileFilter());
        //long size = 0;
        for (File f2 : arr) {
            if (f2.isFile()) {
                //size += f2.length();
                System.out.println(f2+"文件");
            } else {
                scanFileToFolder(f2);
            }
        }
    }
}
