package com.itheima.basicclass;
/*
 * ��������������ض����ܵĴ���顣
 * 
 * �����ʽ��
 * 		���η� ����ֵ���� ������(�������� ������1,�������� ������2...) {
 * 			������;
 * 			return ����ֵ;
 * 		}
 * ��ʽ���ͣ�
 * 		A:���η� Ŀǰ��ס public static
 * 		B:����ֵ���� �����޶�����ֵ����������
 * 		C:������ һ�����֣�Ϊ�˷������ǵ��÷���
 * 		D:�������� ���ڽ��յ��÷���ʱ��������ݵ�����
 * 		E:������  ���ڽ��յ��÷���ʱ��������ݵı���
 * 		F:������ ��ɹ��ܵĴ���
 * 		G:return �����������ѷ���ֵ����������
 * 
 * ������������ȷ��
 * 		A:����ֵ���� ��ȷ���ܽ������������
 * 		B:�����б� ��ȷ�м����������Լ�����������
 * 
 * ������
 * 		���������͵İ�����
 */
public class Test16 {
	public static void main(String[] args) {
		int sum = getSum(2,3);
		System.out.println("sum:"+sum);
	}

    public static int getSum(int i, int j) {
        // TODO Auto-generated method stub
        return i+j;
    }
}
