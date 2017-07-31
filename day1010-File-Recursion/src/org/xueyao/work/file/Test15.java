package org.xueyao.work.file;

import java.io.File;
import java.util.Scanner;

/**
 * 键盘录入一个文件夹路径，删除该路径下的文件夹。
要求：录入的文件夹里面要有多个文件，不能包含有子文件夹。
提示：如果文件夹里面有文件，则需要先将文件删除才能删除文件夹。

 * @author Yao Xue
 * @date Jul 30, 2017 9:42:18 PM
 */
public class Test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件夹路径");
        
        String path = sc.nextLine();
        File f = new File(path);
        if (f.isDirectory()) {
            File[] arr = f.listFiles();
            for (File f2: arr) {
                if (f2.delete()) {
                    System.out.println("删除了"+f2+"文件");
                }
            }
            
        }
        if (f.delete()) {
            System.out.println("删除了"+f+"文件夹");
        } else {
            System.out.println("删除文件夹失败,该文件夹下还有文件夹");
        }
        
        
    }
    
   
}
