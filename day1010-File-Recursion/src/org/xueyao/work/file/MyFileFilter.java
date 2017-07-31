package org.xueyao.work.file;

import java.io.File;
import java.io.FileFilter;

/**
 * @author Yao Xue
 * @date Jul 30, 2017 9:30:13 PM
 */
public class MyFileFilter implements FileFilter{

    @Override
    public boolean accept(File pathname) {
        // TODO Auto-generated method stub
        //判断是否是文件
        boolean boo = pathname.isFile();
        //判断文件后缀名是不是.java
        boolean name = pathname.getName().endsWith(".java");
        
        return boo && name;
    }

   
    
}
