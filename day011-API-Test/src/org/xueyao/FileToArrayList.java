package org.xueyao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 把上一题的文本文件中的学生信息读取出来存储到集合中，然后遍历集合，在控制台输出
 * @author Yao Xue
 * @date Jul 9, 2017 4:01:54 PM
 * 分析： 
 *          A:定义学生类
 *          B:创建输入缓冲流对象
 *          C：创建集合对象
 *          D：读取文件数据 ，并把数据按照一定的格式进行分割赋值给学生对象，然后把学生对象作为元素存储到集合中
 *          E:释放资源
 *          F：遍历集合
 *          
 */
public class FileToArrayList {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("array.txt"));
        
        ArrayList<Student> arrayList = new ArrayList<Student>();
        
        String line;
        while ((line = bufferedReader.readLine())!= null) {
            String[] strArray = line.split(",");
            Student student = new Student();
            student.setId(strArray[0]);
            student.setName(strArray[1]);
            student.setAge(strArray[2]);
            student.setAddress(strArray[3]);
            arrayList.add(student);
        }
        //释放资源
        bufferedReader.close();
        
        //遍历集合
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            System.out.println(student.getId()+"----"+student.getName()+"----"+student.getAge()+"----"+student.getAddress());
        }
        
    }
}
