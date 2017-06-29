package org.xueyao.method;
/**
 * �Ƚ����������Ƿ���ȡ��������ͷֱ�Ϊ����byte���ͣ�
 * ����short����,����int����,����long����,����main�����н��в���
 * @author Yao Xue
 * @date Jun 29, 2017 8:21:51 PM
 */
public class MethodNumberEqual {
    public static void main(String[] args) {
        System.out.println(numberEqual(5, 6));
        
        System.out.println(numberEqual((short)5, (short)7));
        
        System.out.println(numberEqual(5L, 6L));
    }
    
    public static boolean numberEqual(byte num1, byte num2) {
        System.out.println("byte");
        return num1 == num2;
    }
    public static boolean numberEqual(short num1, short num2) {
        System.out.println("short");
        return num1 == num2;
    }
    public static boolean numberEqual(int num1, int num2) {
        System.out.println("int");
        return num1 == num2;
    }
    public static boolean numberEqual(long num1, long num2) {
        System.out.println("long");
        return num1 == num2;
    }
}
