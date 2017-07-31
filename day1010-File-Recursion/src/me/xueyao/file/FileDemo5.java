package me.xueyao.file;

import java.io.File;

/**
 *  boolean isDirectory() 
          测试此抽象路径名表示的文件是否是一个目录。 
    boolean isFile() 
          测试此抽象路径名表示的文件是否是一个标准文件。 
    boolean isHidden() 
          测试此抽象路径名指定的文件是否是一个隐藏文件。 
          注意：上述方法如果指定文件满足要求，则返回true，如果不满足要求或者指定路径不存在返回false
          判断指定路径是否存在： boolean exists() 测试此抽象路径名表示的文件或目录是否存在。 如果指定路径存在返回true否则返回false
          
          总结：在开发中对于上述这几个方法使用：
          先调用exists()方法判断指定路径是否存在，如果存在那么才可以调用上述前三个方法：isDirectory isFile  isHidden
         指定路径 不存在，则不会使用方法。
 * @author Yao Xue
 * @date Jul 31, 2017 1:06:02 PM
 */
public class FileDemo5 {
    public static void main(String[] args) {
        //创建对象 
        File f = new File("D:\\Temp\\Temp\\a.txt");
        //调用方法判断f中指定的路径是否是文件
        boolean boo = f.isFile();  //true
        System.out.println(boo); 
        //判断是否是文件夹
        System.out.println(f.isDirectory()); //false //不是文件夹
        System.out.println(f.exists());  //true  存在
        System.out.println(f.isHidden());  //false  不是隐藏文件
        
        
    }
}
