package org.xueyao.work01;

import java.io.File;
import java.io.FileFilter;

/**
 * @author Yao Xue
 * @date Jul 30, 2017 11:27:48 PM
 */
public class MyFileFilter implements FileFilter{

    @Override
    public boolean accept(File pathname) {

        return pathname.length() < 200*1024;
    }
    
}
