package org.xueyao.file;

import java.io.File;
import java.io.IOException;

/**
 * @author Yao Xue
 * @date Jul 30, 2017 11:34:53 AM
 */
public class FileMethodDem2 {
    public static void main(String[] args) throws IOException {
        //对文件或者文件加进行操作
        File file = new File("FileDemo1.java");
        //创建文件,如果文件不存在,创建true如果文件存在,则不创建false.如果
        //路径错误,IOException.
        //boolean b1 = file.createNewFile();
        //System.out.println("b1="+b1);
        //----------------删除文件操作----注意:不去回收站.慎用.
        //boolean b2 = file.delete();
        //System.out.println("b2="+b2);
        
        //------需要判断文件是否存在----
        //boolean b3 = file.exists();
        //System.out.println("b3="+b3);
        
        //-----对目录操作 创建,删除,判断-----
        File dir = new File("D:\\Temp\\JavaRunTestCodeFolder\\abc");
        //mkdir()创建单个目录 .//dir.mkdirs(); 创建多级目录 
        //boolean b4 = dir.mkdir();
        //System.out.println("b4="+b4);
        //boolean b5 = dir.mkdirs();
        //System.out.println("b5="+b5);
        //删除目录时,如果目录中内容,无法直接删除
        boolean b6 = dir.delete();
        //只有将目录中的内容都删除后,保证该目录为空.这时这个目录才可以删除.
        System.out.println("b6="+b6);
        
        //-----判断文件,目录-----
        File f = new File("D:\\Temp\\JavaRunTestCodeFolder\\abc");
        //f.mkdir();  //f.createNewFile();
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
    }
}
