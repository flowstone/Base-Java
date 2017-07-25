package me.xueyao.work11;
/**
 * @author Yao Xue
 * @date Jul 25, 2017 9:28:05 PM
 */
public class Test19 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
       /* String str = "";  //卡爆了
        for (int i = 0; i < 100000; i++) {
            str += "HelloWorld";
        }*/
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            stringBuffer.append("HelloWorld");
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("程序执行花费了"+time+"ms");
    }
}
