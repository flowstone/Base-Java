package me.xueyao.file;

import java.io.File;

/**
 *  String getAbsolutePath()  返回此抽象路径名的绝对路径名字符串。 
 *  String getPath()  将此抽象路径名转换为一个路径名字符串。 
 *  D:\\abc\\1.txt
 *  绝对路径：D:\\abc\\1.txt 也就是说带根目录或者盘符
 *  相对路径：举例：假设我当前在 D:\\abc 下，那么此时相对路径是 1.txt 也就是说不带盘符的路径
 *  注意：在开发中只要我们书写相对路径就是相对于当前书写的项目
 *  String getName() 返回由此抽象路径名表示的文件或目录的名称。 获取指定路径的最后一级目录名字 包括文件全名
 *  long length() 返回由此抽象路径名表示的文件的长度。 
 * @author Yao Xue
 * @date Jul 31, 2017 12:50:41 PM
 */
public class FileDemo1 {
    public static void main(String[] args) {
        //创建File类的对象 
        File f = new File("D:\\Temp\\Temp\\a.txt");
        //调用方法获取绝对路径
        String path = f.getAbsolutePath();//D:\Temp\Temp\a.txt
        System.out.println(path);
         
        System.out.println(f.getPath()); //D:\Temp\Temp\a.txt
        System.out.println(f.getName()); //a.txt
        System.out.println(f.length());//11
    }
}
