package org.xueyao.work2;
/**
 * 有一堆零件数量不超过1000个,
 * 如果4个零件一组最后剩余2个,如果7个零件一组最后剩余3个,
 * 如果9个零件一组最后剩余5个,请计算这堆零件个数有几种可能
 * @author Yao Xue
 * @date Jul 27, 2017 10:56:04 PM
 */
public class Test21 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            if ((i%4==2) && (i%7 == 3)&&(i%9 == 5)) {
                count ++;
                System.out.println(i+"  ");
            }
        }
        
        System.out.println("总共有"+count+"种");
    }
}
