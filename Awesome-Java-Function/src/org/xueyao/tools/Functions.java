package org.xueyao.tools;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author Yao Xue
 * @date Jul 26, 2017 8:16:39 AM
 */
public class Functions {
    public static void main(String[] args) {
        
    }
    /**
     * @description: 关闭输入输入流对象
     * @date 2017-07-26
     * @param ios 输入输出流对象 
     * 
     */
    public static void closeTo(Closeable ... ios) {
        for (int i = 0; i < ios.length; i++) {
            Closeable io = ios[i];
            if (io != null) {
                try {
                    io.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
