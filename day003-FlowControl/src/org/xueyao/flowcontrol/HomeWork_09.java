package org.xueyao.flowcontrol;
/*
 * �ھ���:�����������󣬲��ô���ʵ�֣�
    1.���������߶�Ϊ8848�ף���һ���㹻���ֽ�����Ϊ0.0001�ס�
    2.���ʣ����۵����ٴΣ������۳����������ĸ߶ȡ�
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
           System.out.println("���۵���:"+count+"��+�����۳����������ĸ߶�Ϊ:"+paperHeight);
        }
        System.out.println("���۵�"+count+"�Σ������۳����������ĸ߶�");
    }
}
