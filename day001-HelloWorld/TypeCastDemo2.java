/*
	ǿ��ת����
		Ŀ������  ������ = (Ŀ������)(��ת��������)
*/
public class TypeCastDemo2 {
	public static void main(String[] args) {
		int a = 10;
		byte b = 20;
		int c = a + b;
		System.out.println(c);

		byte d = (byte)(a + b);
		System.out.println(d);
		
		
	}
}