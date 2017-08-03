package org.xueyao.objectstream.demo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author Yao Xue
 * @date Aug 2, 2017 5:41:09 PM
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("s.txt"));
        
        //Object obj = ois.readObject();
        Student s = (Student)ois.readObject();
        
        System.out.println(s.getName()+"---"+s.getAge());
        ois.close();
    }
}
