package me.xueyao.file;

import java.io.File;

/**
 *  * File类描述：
 * File(String pathname) 通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
 * 注意：
 * 对于 参数 pathname 里面的内容不作为判断，是什么都可以，不会报错，参数是什么，那么对象f中保存的就是什么
 * 
 * File(File parent, String child) 根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
 * D:\\abc\\1.txt
 * parent 父目录 D:\\abc 属于File类型
 * child 子目录 1.txt
 * 
 * File(String parent, String child) 根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
 * D:\\abc\\1.txt
 * parent 父目录 D:\\abc 属于String类型
 * child 子目录 1.txt
 * @author Yao Xue
 * @date Jul 31, 2017 12:44:47 PM
 */
public class FileDemo {
    public static void main(String[] args) {
        //创建File对象
        File f = new File("D:\\Temp\\Temp\\1.txt");
        System.out.println(f);
        
        //创建File类的对象 
        File parent = new File("D:\\Temp\\Temp");
        String child = "1.txt";
        File f2 = new File(parent,child);
        System.out.println(f2);
        
        
        String parent2 = "D:\\Temp\\Temp";
        String child2 = "1.txt";
        File f3 = new File(parent2,child2);
        System.out.println(f3);
    }
}
