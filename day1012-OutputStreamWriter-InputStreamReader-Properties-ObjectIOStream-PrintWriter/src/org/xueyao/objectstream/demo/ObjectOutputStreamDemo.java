package org.xueyao.objectstream.demo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author Yao Xue
 * @date Aug 2, 2017 5:15:33 PM
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws Exception{
        Student s = new Student("小明",19);
        
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("s.txt"));
        
        oos.writeObject(s);
        
        oos.close();
    }
}
