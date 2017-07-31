package org.xueyao.file;

import java.io.File;

/**
 * @author Yao Xue
 * @date Jul 30, 2017 11:12:24 AM
 */
public class FileDemo {
    public static void main(String[] args) {
        //File构造函数演示
        String pathName = "F:\\CODE\\Java\\day1010\\hello.java";
        //将hello文件封装成File对象.注意:有可以封装不存在文件或者文件夹,变成对象 
        File f1 = new File(pathName);
        System.out.println(f1);  //F:\CODE\Java\day1010\hello.java
        
        File f2 = new File("F:\\CODE\\Java\\day1010\\hello.java");
        System.out.println(f2); //F:\CODE\Java\day1010\hello.java
        
        //将parent封装成file对象
        File dir = new File("F:\\CODE\\Java\\day1010");
        System.out.println(dir);
        File f3 = new File(dir,"hello.java");
        System.out.println(f3);
        
    }
}
