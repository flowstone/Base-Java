/*
	+:这是一个运算符，用于加法运算
	我们在做运算时，一般要求参与运算的数据的类型必须一致
*/
public class TypeCastDemo {
	public static void main(String[] args) {
		//定义两个变量
		int a = 3;
		int b = 4;
		int c = a + b;
		System.out.println(c);

		//定义一个btye类型的变量，一个int类型的变量
		byte bb = 2;
		int cc = 5;
		System.out.println(bb + cc);

		//byte ee = bb + cc;
		//System.out.println(ee);

		int dd = bb + cc;
		System.out.println(dd);
	}
}