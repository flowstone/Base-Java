package com.itheima.basicclass;
/*����������ϰ
 * ���󣺱Ƚ����������Ƿ���ȡ��������ͷֱ�Ϊ����byte���ͣ�����short���ͣ�����int���ͣ�����long���ͣ�
 *     ����main�����н��в���
 */
public class Test24 {
	public static void main(String[] args) {
	    boolean bl= printNumber(2,4);
	    boolean b2= printNumber(2L,4L);
	}

    public static boolean printNumber(int i, int j) {
        System.out.println("�ҵ�����int����");
        return i==j;
    }
    public static boolean printNumber(byte i, byte j) {
        System.out.println("�ҵ�����byte����");
        return i==j;
    }
    public static boolean printNumber(short i, short j) {
        System.out.println("�ҵ�����short����");
        return i==j;
    }
    public static boolean printNumber(long i, long j) {
        // TODO Auto-generated method stub
        System.out.println("�ҵ�����long����");
        return i==j;
    }
}
