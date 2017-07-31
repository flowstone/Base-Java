package me.xueyao.test03;

import java.io.File;
import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jul 31, 2017 4:15:31 PM
 */
public class Test03_02 {
    public static void main(String[] args) {
        //获得文件夹对象
        File dir = inputFile();
        //删除文件夹
        delete(dir);
    }
    
    /**
     * 根据用户输入 的路径字符串创建文件对象
     * @return File
     */
    public static File inputFile() {
        //创建键盘输入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件夹路径:");
        //接收用户输入的路径
        String filePath = sc.nextLine();
        //根据路径字符串创建文件对象
        File dir = new File(filePath);
        //判断是否是文件夹
        if (!dir.isDirectory()) {
            throw new RuntimeException("输入的路径不是文件夹路径");
        }
        return dir;
    }
    /**
     * 删除文件夹
     * @param dir  File对象
     */
    public static void delete(File dir) {
        //获取所有文件
        File[] files = dir.listFiles();
        //遍历子目录,删除子目录
        for (File file : files) {
            if (file.isFile()) {
                boolean success = file.delete();
                //判断是否删除成功,主要用于测试自己写的代码 
                if (success) {
                    System.out.println(file+"删除成功");
                } else {
                    System.out.println(file+"正在使用,删除失败");
                }
            } else {
                //如果是文件夹递归删除
                delete(file);
            }
        }
        
        //来到这里说明,该文件夹为空
        boolean success = dir.delete();
        //判断是否删除成功,主要用于测试自己写的代码
        if (success) {
            System.out.println(dir +"删除成功");
        } else {
            System.out.println(dir + "正在使用,删除失败");
        }
    }
}
