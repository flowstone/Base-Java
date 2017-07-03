package com.itheima.basicclass;
/*方法重载练习
 * 需求：比较两个数据是否相等。参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型，
 *     并在main方法中进行测试
 */
public class Test24 {
	public static void main(String[] args) {
	    boolean bl= printNumber(2,4);
	    boolean b2= printNumber(2L,4L);
	}

    public static boolean printNumber(int i, int j) {
        System.out.println("我调用了int类型");
        return i==j;
    }
    public static boolean printNumber(byte i, byte j) {
        System.out.println("我调用了byte类型");
        return i==j;
    }
    public static boolean printNumber(short i, short j) {
        System.out.println("我调用了short类型");
        return i==j;
    }
    public static boolean printNumber(long i, long j) {
        // TODO Auto-generated method stub
        System.out.println("我调用了long类型");
        return i==j;
    }
}
