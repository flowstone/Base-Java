package me.xueyao.file;

import java.io.File;

/**
 * boolean delete() 删除此抽象路径名表示的文件或目录。 
 *  注意：
 *  1.使用此方法要慎用，因为他删除的内容不走回收站
 * @author Yao Xue
 * @date Jul 31, 2017 1:04:14 PM
 */
public class FileDemo4 {
    public static void main(String[] args) {
        //创建对象
        File f = new File("D:\\Temp\\Temp\\abc");
        //调用方法删除指定的路径
        boolean boo = f.delete(); //true
        System.out.println(boo);
    }
}
