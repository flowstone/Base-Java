package org.xueyao.flowcontrol;
/*
 * 第九题:分析以下需求，并用代码实现：
    1.珠穆朗玛峰高度为8848米，有一张足够大的纸，厚度为0.0001米。
    2.请问，我折叠多少次，可以折成珠穆朗玛峰的高度。
    0.0001
    0.0002
    0.0004
    0.0008
 */
public class HomeWork_09 {
    public static void main(String[] args) {
        float paperHeight = 0.0001F;
        int count = 0;
        while (paperHeight <= 8848) {
           count++;
           paperHeight = paperHeight * 2;
           System.out.println("我折叠了:"+count+"次+可以折成珠穆朗玛峰的高度为:"+paperHeight);
        }
        System.out.println("我折叠"+count+"次，可以折成珠穆朗玛峰的高度");
    }
}
