package me.xueyao.list;

import java.io.File;

/**
 * 文件过滤器：
 * FileFilter 接口
 * 需求：获取指定路径下D:\\test下所有后缀名为.jpg的文件,并输出其绝对路径
 * 步骤：
 * 1.创建File类的对象 new File(" D:\\test");
 * 2.使用上述创建的对象调用File类中的  File[] listFiles(FileFilter filter) 
 * 3.自定义一个类实现FileFilter接口，这个类称为过滤器类
 * 4.复写过滤器中的方法：boolean accept(File pathname) 
 *      说明：当上述方法accept返回true，那么说明满足过滤器条件，那么就会将内容存放发到File类型的数组中，否则不会存储
 *      当上述方法listFiles执行完毕以后，那么File类型数组中存放的就是满足条件的内容
 * 5.遍历满足条件的数组，依次取出内容并打印绝对路径
 * 
 *  public File[] listFiles(FileFilter filter) //FileFilter filter=new MyFileFilter()
 * @author Yao Xue
 * @date Jul 31, 2017 1:31:24 PM
 */
public class FileFilterDemo {
    public static void main(String[] args) {
        //1.创建File类的对象 new File("D:\\Temp\\Temp")
        File f = new File("D:\\Temp\\Temp");
        //2.使用上述创建的对象调用File类中的File[] listFiles(FileFilter filter)
        File[] arr = f.listFiles(new MyFileFilter());
        //如果程序执行到这里说明arr数组中存放的是后缀名为.png文件
        //System.out.println(arr.length);
        //遍历
        for (File f2 : arr) {
            System.out.println(f2);
        }
    }
}
