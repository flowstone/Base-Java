package org.xueyao.flowcontrol;

public class BreakAndContinueDemo {
    public static void main(String[] args) {
        //��Ҫ��������������֤
        for (int x = 1; x <= 10; x++) {
            if (x % 3 == 0) {
                //break;  //2��;
                continue;  //7��
            }
            System.out.println("�Ұ�����ϼ");
        }
    }
}
