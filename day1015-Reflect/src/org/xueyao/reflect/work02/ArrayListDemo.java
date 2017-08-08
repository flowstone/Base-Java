package org.xueyao.reflect.work02;

import java.util.ArrayList;

/**
 * 一、ArrayList<Integer> list = new ArrayList<Integer>();
这个泛型为Integer的ArrayList中存放一个String类型的对象
 1：创建集合对象
 2：添加数字可以 但是添加字符串就报错 这时候想到反射
 3：通过对象获得字节码文件对象
 4：通过字节码文件对象得到add方法反射形式
 5: 反射方式 执行add 添加字符串

 * @author Yao Xue
 * @date Aug 6, 2017 10:02:50 PM
 */
public class ArrayListDemo {
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<Integer>();
            
    }
}
