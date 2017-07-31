package me.xueyao.list;

import java.io.File;
import java.io.FileFilter;

/**
 * 3.自定义一个类实现FileFilter接口，这个类称为过滤器类
 * 4.复写过滤器中的方法：boolean accept(File pathname) 
 *      说明：当上述方法accept返回true，那么说明满足过滤器条件，那么就会将内容存放发到File类型的数组中，否则不会存储
 *      当上述方法listFiles执行完毕以后，那么File类型数组中存放的就是满足条件的内容
 * 
 * 需求：获取指定路径下D:\\test下所有后缀名为.jpg的文件,并输出其绝对路径
 * @author Yao Xue
 * @date Jul 31, 2017 1:42:59 PM
 */
public class MyFileFilter implements FileFilter{
    /**
     * //4.复写过滤器中的方法：boolean accept(File pathname) 
     * 参数：pathname 表示 指定父目录D:\\test下面所有的子文件或者子文件夹 D:\test\1.jpg------
     * 
     */
    @Override
    public boolean accept(File pathname) {
        //System.out.println(pathname+"--------");
        //判断pathname是否是文件
        boolean boo = pathname.isFile();
        //判断pathname的后缀名是否是.png
        boolean boo2 = pathname.getName().endsWith(".png");
        return boo && boo2;
    }
    
}
