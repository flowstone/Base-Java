/*
	+:����һ������������ڼӷ�����
	������������ʱ��һ��Ҫ�������������ݵ����ͱ���һ��
*/
public class TypeCastDemo {
	public static void main(String[] args) {
		//������������
		int a = 3;
		int b = 4;
		int c = a + b;
		System.out.println(c);

		//����һ��btye���͵ı�����һ��int���͵ı���
		byte bb = 2;
		int cc = 5;
		System.out.println(bb + cc);

		//byte ee = bb + cc;
		//System.out.println(ee);

		int dd = bb + cc;
		System.out.println(dd);
	}
}