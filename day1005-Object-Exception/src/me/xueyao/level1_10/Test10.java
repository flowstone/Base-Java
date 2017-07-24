package me.xueyao.level1_10;
/**
 * 2.   定义 Test10类
3.  提供一个静态方法:public static char charAt(String str, int index) 用于获取字符串str,index索引处的字符
4.  在方法中charAt(String,int index)
a)      当字符串为null抛出 Exception("字符串不能为null")异常,
b)      当字符串为"" 的时候抛出 Excetion("字符串不能为空") 异常;
c)      当index不在 [0,str.length()-1] 之间的时,抛出Exception("索引越界") 异常. 
d)      否则返回str在index索引的字符
5.  提供一个静态的方法testThrows() 用于测试charAt(String,int index)方法
a)  在方法中调用charAt(String,int index)方法;
i.  注意需要测试每一种情况
ii. 体会: 程序一旦遇到异常后面的代码就不执行了
iii.    注释运行过测试的代码,继续测试下一种情况
b)  使用throws方式对异常进行处理
c)  在main方法中,调用本方法
6.  提供 一个静态方法testTryCatch(),用于测试charAt(String,int index)方法
a)  在方法中调用charAt(String,int index)方法;
i.  注意需要测试每一种情况
b)  使用try...catch方式对异常进行处理
c)  在main方法中,调用本方法.

 * @author Yao Xue
 * @date Jul 23, 2017 7:53:53 PM
 */
public class Test10 {
    public static void main(String[] args) throws Exception {
        testThrows();
        testTryCatch();
    }
    
    public static char charAt(String str,int index) throws Exception {
        if (str == null) {
            throw new Exception("字符串不能为null");
        }
        if (str == "") {
            throw new Exception("字符串不能空");
        }
        if (index<0 || index >= str.length()-1) {
            throw new Exception("索引越界");
        }
        return  str.charAt(index);
        
    }
    
    public static void testThrows() throws Exception {
        //字符串不能为null
        //Test10.charAt(null, 1);
        //字符串不能空
        //Test10.charAt("", 2);
        
        //索引越界
        //Test10.charAt("Hello", 5);
    }
    
    public static void testTryCatch() {
        
        try {
          //字符串不能为null
          //  Test10.charAt(null, 1);
          
            //字符串不能空
            //Test10.charAt("", 2);
            
            //索引越界
            //Test10.charAt("Hello", 5);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}

