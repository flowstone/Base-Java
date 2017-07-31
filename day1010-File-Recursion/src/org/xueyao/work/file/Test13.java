package org.xueyao.work.file;

import java.io.File;

/**
 * 递归遍历将指定文件夹的所有文件(包括所有子文件夹的文件)的全路径输出在控制台。
 * @author Yao Xue
 * @date Jul 30, 2017 9:08:00 PM
 */
public class Test13 {
    public static void main(String[] args) {
        File f = new File("D:\\Temp\\JavaRunTestCodeFolder");
        
        scanFileToFolder(f);
    }
    
    public static void scanFileToFolder(File f) {
        File[] arr = f.listFiles();
        for (File f2:arr) {
            if (f2.isFile()) {
                String path = f2.getAbsolutePath();
                System.out.println(path);
            } else  {
                scanFileToFolder(f2);
            }
        }
    }
}
