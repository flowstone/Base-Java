package com.itheima_01;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Yao Xue
 * @date Jul 8, 2017 10:15:39 AM
 */
public class FileWriterDemoCopy {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("itheimacopy.txt");
        
        fw.write("ÄãºÃ£¬ÀöÀö");
        fw.flush();
        fw.close();
    }
}
